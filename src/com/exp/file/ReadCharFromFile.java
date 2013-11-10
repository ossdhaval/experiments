package com.exp.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class ReadCharFromFile {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("d:\\input.txt");
		
		CharBuffer target = CharBuffer.allocate(1);
		try {
			fr.read(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(target.array());

	}

}
