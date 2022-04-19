
public class FooCorporation {
		public static void salary(double basePay,int hoursWorked)
		{
		if((hoursWorked>60) || (hoursWorked<0))
			{
				System.out.println("Error:Employee worked more than 60 hours.");
			}
		else if((basePay < 8.00) || (basePay < 0))
			{
				System.out.println("Error:Employee is paid less than base pay.");
			}
		else
			{
				double hoursOver40 = hoursWorked-40;
				double totalPay = 0.0;
				
			if(hoursOver40 <= 0)
				{
					totalPay = hoursWorked * basePay;
					System.out.println("Employee worked " + hoursWorked + " hours and and total pay is $" + totalPay);
				}
			else
				{
					totalPay = 40*basePay + (hoursOver40 * (basePay*1.5));
					System.out.println("Employee worked " + hoursWorked + " hours and total pay is $" + totalPay);
				}
			}
		}
			
 public static void main(String[] arguments)
		{ 
			salary(7.50,35);
			salary(8.20,47);
			salary(10.00,73);
		}
	}

