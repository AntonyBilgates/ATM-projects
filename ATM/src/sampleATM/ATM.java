package sampleATM;



import java.util.HashMap;

import java.util.Scanner;




public class ATM {

	public static void main(String[] args) throws PasswordMismatchException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to IOB ATM");
		
		HashMap<Long,Integer>ob=new HashMap<>();
		
		ob.put(89477302l, 3034);
		ob.put(96873672l, 9091);
		
		HashMap<Long,Integer>balances=new HashMap<>();
		
		balances.put(89477302l, 5000);
		balances.put(96873672l, 7000);

	
	    
		
		System.out.print("enter the Account Number : ");
		
		Long no=sc.nextLong();
		
		if(ob.containsKey(no)) {
			System.out.print("enter the pin number : ");
			int pin=sc.nextInt();
			
			if(ob.get(no)==pin) {
				System.out.println("login Sucessfull");
				
				int balance=balances.get(no);
				boolean a=true;
				while(a) {
					
				
					
					
				System.out.println("(1) check Balance : ");
				System.out.println("(2) withdraw : ");
				System.out.println("(3) AddBalance: ");
				System.out.println("(4) exit: ");
				
				int check=sc.nextInt();
				
				switch(check) {
				case 1:
					
					System.out.println("Your  balance is : Rs " + balance);
					break;
					
				case 2:
					System.out.println("Enter the Amount");
					
					int amount=sc.nextInt();
					
					if(amount==balance) {
						
						System.out.println("plz check your amount ");
						
					}
					else if(amount>balance) {
						System.out.println("check the balance");
					}
					else {
						balance=balance-amount;
						
						System.out.println("wait for few Seconds");
						
						System.out.println("your Transection Sucessfully");
						
						System.out.println("your Available balance is " + balance);
					
					}
					break;
					
				case 3:
					
					System.out.print("your Current balance Rs : " + balance);
					System.out.print("Add the amount Rs : ");
					int add=sc.nextInt();
					
					balance=add+balance;
					
					System.out.println("your Current balance Rs : " + balance);
					break;
			
				case 4:
					System.out.print("Thank you");
					a=false;
					break;
					
				default:
					System.out.print("enter the valid number");
					break;
				}
			}
			
			}
			
			
			else {
				throw new PasswordMismatchException ("password is incorrect");
			}
		}
		else {
			System.out.println("invalid Account number");
		}
		
		
		
		
	}

}
