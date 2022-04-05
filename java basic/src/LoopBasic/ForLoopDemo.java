package LoopBasic;

	import java.io.BufferedWriter;

	import java.io.FileWriter;

	import java.io.IOException;



	public class ForLoopDemo {

		public static void writeIntoFile(String data,String file) throws IOException  {

			FileWriter writer = new FileWriter(file);

			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			bufferedWriter.write(data);

			bufferedWriter.close();

		}


		static void printRowOfKSize(int row) throws IOException {

			if(row <= 0) {

				throw new IllegalArgumentException("Row Value Should Be Greater Than Zero");

			}

			String fileName = "output.txt";

			String currentRow = "";

			for (; row >= 1; row--) {

				for (int column = 0; column < row; column++) {

					currentRow += "*";

				}

				currentRow += "\n";

			}

			writeIntoFile(currentRow,fileName);

		}



		public static void main(String[] args) throws IOException {

			printRowOfKSize(5);

		}
	}

