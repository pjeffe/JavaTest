package com.bartonsoft.test1;

import java.io.*;

public class ImportTest {
	public static void method() {
		System.out.println("test1");
		try {
			final OutputStream out = new FileOutputStream("test");
			out.write(0);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
