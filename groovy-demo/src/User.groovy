import java.io.File
class User {
	
	   static void main(String[] args) {
		  new File("Example.txt").eachLine {
			 line -> println "line : $line";
		  }
	   }
	}

