

public class GiftCardDetail {
	static int CARDNUMBER = 100;
	int cardNo;
	int custID;
	int pin;
	long giftbalance;
	boolean status;
	boolean blocked;

	GiftCardDetail(int custID, int pin, long giftbalance, boolean status, boolean blocked) {
		this.custID = custID;
		this.pin = pin;
		this.giftbalance = giftbalance;
		this.status = status;
		this.blocked = blocked;
		cardNo = CARDNUMBER++;
	}
}
