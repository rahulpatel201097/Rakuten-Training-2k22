package BankInfo;

public class CustomerDetail {
	static int counter = 1000;
	private int id;
	private String name;
	private String address;
	private String mobNo;
	private String emailId;
	
	public CustomerDetail(String name,String address,String mobNo,String emailId) {
		this.id = generateNewId();
		this.name = name;
		this.address = address;
		this.emailId = emailId;
		this.mobNo = mobNo;
	}
	private int generateNewId() {
		return ++counter;
	}
	public void printDetails() {
		System.out.println("Customer ID : " + id);
		System.out.println("Customer Name : " + name);
		System.out.println("Customer Address : " + address);
		System.out.println("Customer emailId : " + emailId);
		System.out.println("Customer Mobile : " + mobNo);
		
	}
	public String getDetailsAsString() {
		String res = new String();
		res += "Customer ID : " + id + ", ";
		res += "Customer Name : " + name + ", ";
		res += "Customer Address : " + address + ", ";
		res += "Customer Email : " + emailId + ", ";
		res += "Customer Mobile : " + mobNo + ".";
		
		return res;
	}

}
