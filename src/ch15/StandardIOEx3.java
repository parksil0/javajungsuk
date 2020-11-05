package ch15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOEx3 {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("text.txt");
			ps = new PrintStream(fos);
			System.setOut(ps);				//System.out�� ��´���� test.txt���Ϸ� ����
		} catch (FileNotFoundException e) {
			System.err.println("File not found.");
		}
		
		System.out.println("hello by system.out");
		System.err.println("hello by system.err");
	}
}
