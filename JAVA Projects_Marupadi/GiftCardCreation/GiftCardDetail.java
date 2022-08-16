

public class GiftCardDetail {
	static int CARDNUMBER = 100;
	int cardNo;
	int custID;
	int pin;
	long giftbalance;
	boolean status;
	boolean blocked;
	int rewardoints;
	String cardtype;

	GiftCardDetail(int custID, int pin, long giftbalance, boolean status, boolean blocked, int rewardoints, String cardType) {
		this.custID = custID;
		this.pin = pin;
		this.giftbalance = giftbalance;
		this.status = status;
		this.blocked = blocked;
		this.rewardoints = rewardoints;
		this.cardtype = cardType;
		cardNo = CARDNUMBER++;
	}
}
