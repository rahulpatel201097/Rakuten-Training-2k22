
class eachFile {
		static void main(String[] args) {
		   new File("Temp").eachFile() {
			  file->println file.getAbsolutePath()
		   }
		}
	 }

