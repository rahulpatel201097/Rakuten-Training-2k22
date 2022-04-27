
class DateTime {
		static void main(String[] args) {
		/*   Date date = new Date();
		   
		   // display time and date using toString()
		   System.out.println(date.toString()); */
		   
		   /*Date date = new Date(100);
		   
		   // display time and date using toString()
		   System.out.println(date.toString());*/
      
			/*Date olddate = new Date("03/27/2022");
			Date newdate = new Date("04/27/2022");
			Date latestdate = new Date();
			  
			System.out.println(olddate.after(newdate));
			System.out.println(latestdate.after(newdate));*/
			
			Date olddate = new Date("04/27/2022");
			Date newdate = new Date("04/27/2022");
			Date latestdate = new Date();
			
			System.out.println(olddate.equals(newdate));
			System.out.println(latestdate.equals(newdate));
			
			System.out.println(olddate.compareTo(newdate));
			System.out.println(latestdate.compareTo(newdate));
			
			System.out.println(olddate.toString());
			System.out.println(newdate.toString());
			System.out.println(latestdate.toString());
			
			System.out.println(olddate.before(newdate));
			System.out.println(olddate.before(latestdate));
			
			System.out.println(olddate.getTime());
			System.out.println(newdate.getTime());
			System.out.println(latestdate.getTime());
	  
			olddate.setTime(10000);
			newdate.setTime(10000);
			latestdate.setTime(10000);
			System.out.println(olddate.toString());
			System.out.println(newdate.toString());
			System.out.println(latestdate.toString());
		}
	 }

