package com.bankapplication;

import java.util.Scanner;

public class ProcessingPage {

	public void deposit(Long accnum) {
		// TODO Auto-generated method stub
		User details = SignUpPage.userDetail.get(accnum);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to deposit");
		Double depositamount = sc.nextDouble();
		
		if(depositamount>0 && depositamount!=null)
		{
			Double balance = details.getBalance()+depositamount;
			System.out.println(depositamount+" is credit to your Account");
			System.out.println("Total Balance In your Account: "+accnum+" is :"+balance);
			details.setBalance(balance);
			SignUpPage.userDetail.put(accnum, details);
		}
		else {
			System.out.println("Enter a correct amount");
		}
	}

	public void withdraw(Long accnum) {
		// TODO Auto-generated method stub
		User details = SignUpPage.userDetail.get(accnum);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to Withdraw");
		Double withdrawamount = sc.nextDouble();
		if(withdrawamount < details.getBalance() && withdrawamount > 0)
		{
			Double balance = details.getBalance() - withdrawamount;
			details.setBalance(balance);
			System.out.println(withdrawamount+" is debitted from your Account");
			System.out.println("Total Balance In your Account: "+accnum+" is :"+balance);
			SignUpPage.userDetail.put(accnum, details);
		}
		else {
			System.out.println("Insufficient Balance to withdraw");
		}
	}

	public void transfer(Long accnum) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Long receiverAccNum = null;
		User details = SignUpPage.userDetail.get(accnum);
		
		int i =0;
		while(i<2)
		{
			System.out.println("Enter Account Number to transfer the amount:");
			receiverAccNum = sc.nextLong();
			if(SignUpPage.userDetail.containsKey(receiverAccNum))
			{
				User receiverdetail = SignUpPage.userDetail.get(receiverAccNum);
				System.out.println("Enter the amount to transfer: ");
				Double transferAmount = sc.nextDouble();
				if(transferAmount > 0 && transferAmount < details.getBalance())
				{
					Double senderBalance = details.getBalance() - transferAmount;
					details.setBalance(senderBalance);
					SignUpPage.userDetail.put(accnum,details);
					System.out.println("Sender "+details.getBalance());
					Double receiverBalance = receiverdetail.getBalance() + transferAmount;
					receiverdetail.setBalance(receiverBalance);
					SignUpPage.userDetail.put(receiverAccNum, receiverdetail);
					System.out.println("Receiver "+receiverdetail.getBalance());
				}
				i=2;
			}
			else{
				System.out.println("Enter a valid Account Number:");
				i++;
			}
		}
	}

	public void checkbalance(Long accnum) {
		// TODO Auto-generated method stub
		User details = SignUpPage.userDetail.get(accnum);
		System.out.println("Hai "+details.getName()+" your account balance is "+details.getBalance());
		//details.getBalance();
	}

}
