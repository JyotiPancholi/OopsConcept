package oops.constructors.com;

class ChainingFirstPerson {

	private String name;
	private String address;
	private String mobile;
	private int age;
	
	public ChainingFirstPerson(String name, int age)
	{
		this.name =name;
		this.age = age;
	}
	
	public ChainingFirstPerson(String name, String address, String mobile, int age) {
		this(name,age);
		this.address = address;
		this.mobile = mobile;
	}
//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class TestChainingFirstPerson {

	public static void main(String[] args) {
		ChainingFirstPerson cfp1 =new ChainingFirstPerson("jiya","vijay nagar","+918349806674", 23);
		ChainingFirstPerson cfp2 =new ChainingFirstPerson("Vaidharvi","vijay nagar","+916260594134", 23);

		System.out.println(cfp1.getName()+"  "+cfp1.getAddress()+"  "+cfp1.getMobile()+"  "+cfp1.getAge());
		System.out.println(cfp2.getName()+"  "+cfp2.getAddress()+"  "+cfp2.getMobile()+"  "+cfp2.getAge());
	
	}

}
