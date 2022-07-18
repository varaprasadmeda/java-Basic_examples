package com.java;

public class Account {
	
	static String bankName = "HDFC Bank";
	
	String account_holde_Name ;
	int account_number ;
	char status ;
	double balance ;
	String address ;
	boolean required ;	
	
	
	public static void main(String[] args) {
		
		Account vaseemAccount = new Account();
		//vaseemAccount.bankName="SBI";
		vaseemAccount.account_holde_Name ="Vaseem";
		vaseemAccount.account_number=1234567;
		vaseemAccount.status='A';
		vaseemAccount.balance =100000.98;
		vaseemAccount.address="Hyderabad";
		vaseemAccount.required=true;
		
		System.out.println("========> Vaseem Detaisls<---------");
		System.out.println("bankName = "+bankName);
		System.out.println("bankName = "+vaseemAccount.bankName);
		System.out.println("account_holde_Name ="+ vaseemAccount.account_holde_Name);
		System.out.println("account_number= "+ vaseemAccount.account_number);
		System.out.println("status = "+ vaseemAccount.status);
		System.out.println("balance = "+ vaseemAccount.balance);
		System.out.println("address = "+ vaseemAccount.address);
		System.out.println("required = "+ vaseemAccount.required);
	
		
		Account varaprasad = new Account();
		//varaprasad.bankName="Union Bank";
		varaprasad.account_holde_Name ="Varaprasad";
		varaprasad.account_number=3456890;
		varaprasad.status='I';
		varaprasad.balance =500000.98;
		varaprasad.address="Chennai";
		varaprasad.required=false;
		
		System.out.println("========> Varaprasad Detaisls<---------");
		System.out.println("bankName = "+bankName);
		//System.out.println("bankName = "+varaprasad.bankName);
		System.out.println("account_holde_Name ="+ varaprasad.account_holde_Name);
		System.out.println("account_number= "+ varaprasad.account_number);
		System.out.println("status = "+ varaprasad.status);
		System.out.println("balance = "+ varaprasad.balance);
		System.out.println("address = "+ varaprasad.address);
		System.out.println("required = "+ varaprasad.required);
		
	}
	

}


