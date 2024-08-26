package oops.encapsulation.com;

public class Accountt {
private String acname;
private float balance;
private String actype;


public String getAcname() {
	return acname;
}
public void setAcname(String acname) {
	this.acname = acname;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
public String getActype() {
	return actype;
}
public void setActype(String actype) {
	this.actype = actype;
}

public void deposite(float amount) {
	float bal = getBalance();
	setBalance(bal+amount);
	System.out.println(acname +"  deposite balance is : " +amount);
	}

public void withdraw (float amount) {
	float bal = getBalance();
	if (bal>=amount) {
		setBalance(bal-amount);
		System.out.println("withdrawl successfully");
	}else {
		System.out.println("insufficient balance");
	}
}
public void fundtransfer(Accountt b ,float amount) {
	float frombal  = getBalance();
	float tobal    = b.getBalance();
	if(frombal>=amount) {
		setBalance(frombal-amount);
		b.setBalance(tobal+amount);
	}else {
		System.out.println("insufficient balance");
	}
  }
}
