package oops.encapsulation.com;

public class TestAccount  {
	public static void main(String[] args) {
		Accountt aa = new Accountt();
		Accountt bb = new Accountt();
		
		aa.setAcname("shivangi");
		aa.setActype("salary account");
		aa.setBalance(1430);


		bb.setAcname("lavya");
		bb.setActype("current account");
		bb.setBalance(1890);
		
		System.out.println("aa details : ");
		System.out.println(aa.getAcname()+"   "+aa.getActype()+"   "+aa.getBalance());
		
		System.out.println("bb details : ");
		System.out.println(bb.getAcname()+"   "+aa.getActype()+"   "+aa.getBalance());
		
		aa.deposite(1200987);
		bb.deposite(3452000);
		
		System.out.println(aa.getBalance());
		System.out.println(bb.getBalance());
	
		aa.withdraw(12907);
		bb.withdraw(9000);
		
		System.out.println(aa.getBalance());
		System.out.println(bb.getBalance());
		
		aa.fundtransfer(bb,48000);
		System.out.println(aa.getBalance());
		System.out.println(bb.getBalance());
		
		System.out.println("*****************************");
		
		aa.fundtransfer(bb,8000);
		System.out.println(aa.getBalance());
		System.out.println(bb.getBalance());
		
	}
}
