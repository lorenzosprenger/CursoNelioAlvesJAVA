package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		System.out.println("For i:");
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
			
		}
		
		
		System.out.println("-".repeat(10));
		
		System.out.println("For each:");
		for (String string : vect) {
			System.out.println(string);
			
		}
	}
	
}
