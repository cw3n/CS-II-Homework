import java.io.*;
import java.util.Scanner;

public class Exercise_17_14 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the encrypted file name: ");
		String inFile = input.next();
		System.out.print("Enter the decrypted file name: ");
		String outFile = input.next();

		try ( // Create two random access files
			RandomAccessFile encrypted = new RandomAccessFile(inFile, "r");
			RandomAccessFile decrypted = new RandomAccessFile(outFile, "rw");
		) {
			int r;
			encrypted.seek(0);
			while ((r = encrypted.read()) != -1) {
				decrypted.write(((byte)r) - 5);
			}
		}
	}
}