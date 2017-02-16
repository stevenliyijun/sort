package testExtend;

public class testHeight {

	
	
	
	public static void main(String args[]) {
		
		Animal a = new Animal();
		a.getHeight();
		System.out.println(a.height);
		
		System.out.println("---");
		
		Animal b = new Cat();
		b.getHeight();
		System.out.println(b.height);
		
		System.out.println("---");
		
		Cat c = new Cat();
		c.getHeight();
		c.getHeight(5);
		//System.out.println(c.height);
		
		
	}
}
