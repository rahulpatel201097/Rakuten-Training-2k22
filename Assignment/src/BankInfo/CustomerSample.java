package BankInfo;

public class CustomerSample {

	public static void main(String[] args) {
		String name = "John";
		String address = "King-Enclave,banglore";
		String emailid = "john123@gmail.com";
		String mobile = "9876543210";
		Customer customerDetail = new Customer(name,address,mobile,emailid);
		customer.printDetails();
		String customerDetails = customer.getDetailsAsString();
		System.out.println(customerDetails);
	}

}