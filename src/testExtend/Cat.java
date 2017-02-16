package testExtend;

public class Cat extends Animal {
	
	private int height = 10;
	
	public int getHeight() {
		System.out.println(height);
		return height;
	}
	
	
	int getHeight(final int c) {
		System.out.println(height);
		return height;
	}
	

}
