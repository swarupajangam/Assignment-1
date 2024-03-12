public class GFG {
	public static void main(String args[])
	{
		String str = "Java Fullstack Develofer";
		int i = 21;
		char c = 'p';
		System.out.println("Original String = " + str);
		StringBuilder string = new StringBuilder(str);
		string.setCharAt(i, c);
		System.out.println("Modified String = " + string);
	}
}


OUTPUT:

Original String = Java Fullstack Develofer
Modified String = Java Fullstack Developer
