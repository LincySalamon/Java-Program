
public class TransactionSummary {
	static int transactionNo = 1000;
	int cardNo;
	long amount;
	int txNo;

	public TransactionSummary(int cardNo, long amount) {
		this.cardNo = cardNo;
		this.amount = amount;
		txNo = transactionNo++;
	}
}
