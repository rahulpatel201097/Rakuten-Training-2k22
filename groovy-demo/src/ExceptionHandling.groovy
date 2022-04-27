
class ExceptionHandling {
	static void main(String[] args) {
		
	  /*  File file = new File("file.txt");
	   FileReader fr = new FileReader(file);*/
	   
	   /* try {
		   def arr = new int[3];
		   arr[5] = 5;
		} catch(ArrayIndexOutOfBoundsException ex) {
		   println("Catching the Array out of Bounds exception");
		}catch(Exception ex) {
		   println("Catching the exception");
		} finally {
		   println("The final block");
		}
		  
		println("Let's move on after the exception");*/
	   
	   try {
		   def arr = new int[3];
		   arr[5] = 5;
		}catch(ArrayIndexOutOfBoundsException ex) {
		   println(ex.toString());
		   println(ex.getMessage());
		   println(ex.getStackTrace());
		} catch(Exception ex) {
		   println("Catching the exception");
		}finally {
		   println("The final block");
		}
		  
		println("Let's move on after the exception");
  
	}
}