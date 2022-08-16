

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GiftCard {
	static HashMap<Integer, Long> custometDetails = new HashMap<Integer, Long>();
	static ArrayList<GiftCardDetail> giftCard = new ArrayList<GiftCardDetail>();
	static ArrayList<TransactionSummary> transaction = new ArrayList<TransactionSummary>();

	public static void main(String[] args) {
		new GiftCard().addAccount();
	}

	private void addAccount() {
		Scanner sc = new Scanner(System.in);
		custometDetails.put(10001, 10000l);
		custometDetails.put(10002, 20000l);
		custometDetails.put(10003, 50000l);
		boolean loop = true; 
		while (loop) {
			System.out.println();
			System.out.println("1.Account Summary\n2.Create Gift Card\n3.GiftCard Summary\n4.Top-Up Gift Card"
					+ "\n5.Close Gift Card\n6.Purchase Item\n7.Block Card\n8.Un-Block\n9.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				printAccountSummary(custometDetails);
				break;
			}
			case 2: {
				System.out.println("Enter account id to create gift card");
				int accountID = sc.nextInt();
				System.out.println("Enter a pin number");
				int pinNum = sc.nextInt();
				System.out.println("Enter a gift card balance");
				long giftBalance = sc.nextLong();

				if (custometDetails.containsKey(accountID)) {
					amountDeduction(custometDetails, giftBalance, accountID);
					giftCard.add(new GiftCardDetail(accountID, pinNum, giftBalance, true, false));
					printGiftCardSummary(giftCard);
					printAccountSummary(custometDetails);
				} else {
					System.out.println("Invalid Customer ID");
					loop = false;
				}
				break;
			}
			case 3: {
				printGiftCardSummary(giftCard);
				printAccountSummary(custometDetails);
				break;
			}
			case 4: {
				System.out.println("Enter card Number to Top Up");
				int cardNum = sc.nextInt();
				System.out.println("Enter Pin Number to verify");
				int pin = sc.nextInt();
				System.out.println("Enter top-up balance");
				long topUpBalance = sc.nextLong();

				for (GiftCardDetail gd : giftCard) {
					if (!gd.blocked) {
						if (gd.cardNo == cardNum && gd.pin == pin && gd.status) {
							int customerId = gd.custID;
							amountDeduction(custometDetails, topUpBalance, customerId);
							updateGiftCardDetails(cardNum, topUpBalance);
							printGiftCardSummary(giftCard);
							printAccountSummary(custometDetails);
						}
					}
				}
				break;
			}
			case 5: {
				System.out.println("Close Gift Card");
				boolean isClosed = true;
				System.out.println("Enter Card Number");
				int cardNum = sc.nextInt();
				System.out.println("Enter PIN number");
				int pin = sc.nextInt();

				for (GiftCardDetail gd : giftCard) {
					if (gd.cardNo == cardNum && gd.pin == pin && gd.status) {
						int customerID = gd.custID;
						long giftamount = gd.giftbalance;
						amountAddedToAccount(customerID, custometDetails, giftamount);
						updateGiftCardDetails(cardNum, isClosed);
						printGiftCardSummary(giftCard);
						printAccountSummary(custometDetails);
					}
				}
				break;
			}
			case 6: {
				System.out.println("PURCHASE ITEM");
				System.out.println("Enter Card Number");
				int cardNum = sc.nextInt();
				System.out.println("Enter Pin");
				int pin = sc.nextInt();
				System.out.println("Enter amount to purchase");
				long purchaseamount = sc.nextLong();

				updateGiftCardWhenPurchsed(pin, cardNum, purchaseamount);
				printTransactionSummary();
				break;
			}
			case 7: {
				System.out.println("-------------Block GIFT CARD --------------");
				System.out.println("Enter card Number");
				int cardNum = sc.nextInt();
				System.out.println("Enter PIN number");
				int pin = sc.nextInt();
				for (GiftCardDetail gd : giftCard) {
					if (!gd.blocked) {
						if (gd.cardNo == cardNum && gd.pin == pin && gd.status) {
							updateGiftCardDetailForBlock(cardNum, pin);
							printGiftCardSummary(giftCard);
						}
					}
				}
				break;
			}
			case 8: {
				System.out.println("-------------Un - Block GIFT CARD --------------");
				System.out.println("Enter card Number");
				int cardNum = sc.nextInt();
				System.out.println("Enter PIN number");
				int pin = sc.nextInt();
				for (GiftCardDetail gd : giftCard) {
					if (gd.blocked) {
						if (gd.cardNo == cardNum && gd.pin == pin && gd.status) {
							updateGiftCardDetailForUnBlock(cardNum, pin);
							printGiftCardSummary(giftCard);
						}
					}
				}
				break;
			}
			case 9: {
				loop = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}

	private void updateGiftCardDetailForUnBlock(int cardNum, int pin) {
		for (GiftCardDetail gd : giftCard) {
			if (gd.cardNo == cardNum && gd.pin == pin) {
				gd.blocked = false;
			}
		}
	}

	private void updateGiftCardDetailForBlock(int cardNum, int pin) {

		for (GiftCardDetail gd : giftCard) {
			if (gd.cardNo == cardNum && gd.pin == pin) {
				gd.blocked = true;
			}
		}
	}

	private void updateGiftCardWhenPurchsed(int pin, int cardNum, long purchaseamount) {

		for (GiftCardDetail gd : giftCard) {
			if (purchaseamount < gd.giftbalance) {
				if (gd.status && !gd.blocked) {
					if (gd.cardNo == cardNum && gd.pin == pin) {
						transaction.add(new TransactionSummary(cardNum, purchaseamount));
						long balance = gd.giftbalance - purchaseamount;
						gd.giftbalance = balance;
					}
				}
			}
		}
	}

	private void updateGiftCardDetails(int cardNum, boolean isClosed) {
		if (isClosed) {
			for (GiftCardDetail gd : giftCard) {
				if (gd.cardNo == cardNum) {
					gd.giftbalance = 0;
					gd.status = false;
				}
			}
		}
	}

	private void amountAddedToAccount(int customerID, HashMap<Integer, Long> custometDetails2, long giftamount) {
		long balance = 0;
		for (Map.Entry<Integer, Long> entry : custometDetails.entrySet()) {
			if (entry.getKey() == customerID) {
				balance = entry.getValue() + giftamount;
				custometDetails.put(customerID, balance);
			}
		}

	}

	private void updateGiftCardDetails(int cardNum, long topUpBalance) {

		for (GiftCardDetail gd : giftCard) {
			if (gd.cardNo == cardNum) {
				gd.giftbalance += topUpBalance;
			}
		}

	}

	private void amountDeduction(HashMap<Integer, Long> custometDetails2, long giftBalance, int accountID) {
		long balance = 0;

		for (Map.Entry<Integer, Long> entry : custometDetails.entrySet()) {
			if (entry.getKey() == accountID) {
				if (entry.getValue() > giftBalance) {
					balance = entry.getValue() - giftBalance;
					custometDetails.put(accountID, balance);
				} else {
					System.out.println("Enter a valid amount");
					break;
				}
			}
		}

	}

	private void printGiftCardSummary(ArrayList<GiftCardDetail> giftCard) {
		System.out.println("-------------GIFT CARD SUMMARY-------------------");
		System.out.println("Card No.\tCust Id\tPIN\tGift Balance\tStatus\tBlocked/not");
		for (GiftCardDetail gd : giftCard) {
			String status = null;
			if (gd.status == true) {
				status = "Active";
			} else {
				status = "Closed";
			}
			String blocked = null;
			if (gd.blocked == true)
				blocked = "Blocked";
			else
				blocked = "Not";
			System.out.print(gd.cardNo + "\t\t" + gd.custID + "\t" + gd.pin + "\t\t" + gd.giftbalance + "\t" + status
					+ "\t" + blocked);
			System.out.println();
		}
		System.out.println("*****************************************************");
	}

	private void printAccountSummary(HashMap<Integer, Long> custometDetails) {
		System.out.println("--------------------ACCOUNT SUMMARY------------------");
		System.out.println("CustomerID\tBalance");
		System.out.println();
		for (Map.Entry<Integer, Long> entry : custometDetails.entrySet()) {
			System.out.print(entry.getKey() + "\t\t" + entry.getValue());
			System.out.println();
		}
		System.out.println("*****************************************************");
	}

	public void printTransactionSummary() {
		System.out.println("------------------TRANSACTION SUMMARY------------------------------");
		System.out.println("Tx.No\tCard No\tAmount");
		for (TransactionSummary ts : transaction) {
			System.out.println(ts.txNo + "\t" + ts.cardNo + "\t" + ts.amount);
		}
		System.out.println("*******************************************************************");
	}

}
