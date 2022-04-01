package bankinfo;

public class AccountInfo {
	
		static int accountCounter = 100000;
		private enum types{
			FD,SB;
		}
		private int accountNumber;
		private String openingDate;
		private types type;
		private double balance;
		private int id;
		
		
		public AccountInfo(int id, String openingDate, double balance) {
			this.accountNumber = generateNewAccountNumber();
			this.openingDate = openingDate;
			this.type = types.FD;
			this.balance = balance;
			this.id = id;
		}
		private int generateNewAccountNumber() {
			return ++accountCounter;
		}
		public String getDetailsAsString() {
			String res = new String();
			res += "Account Number : " + accountNumber + ", ";
			res += "Customer ID : " + id + ", ";
			res += "Account Type : " + type + ", ";
			res += "Account Creation Date : " + openingDate + ", ";
			res += "Account Balance : " + balance + ".";
			
			return res;
		}
		
	}

