package testExtend;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal {
	
	private int height = 10;
	
	public int getHeight() {
		System.out.println(height);
		return height;
	}
	
	
	int getHeight(final int c) {
		List aa = new ArrayList();
		System.out.println(height);
		return height;
	}
	

}
