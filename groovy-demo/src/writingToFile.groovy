
class writingToFile {
	   static void main(String[] args) {
		  new File('Example.txt').withWriter('utf-8') {
			 writer -> writer.writeLine 'Hello World'
		  }
	   }
	}

