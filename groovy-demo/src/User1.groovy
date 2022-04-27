import java.io.File
class User1  {
		static void main(String[] args) {
		   def file = new File('Example')
		   println "File? ${file.isFile()}"
		   println "Directory? ${file.isDirectory()}"
		}
	 }

