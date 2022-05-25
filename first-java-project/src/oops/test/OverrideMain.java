package oops.test;

class Test
{
	static void printPattern(int rows)
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		printPyramid(5);
	}
	static void printPyramid(int rows)
	{
		int k=rows,i,j;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=rows;j++)
			{
				if(j>=k)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			k--;
			System.out.println();
		}
	}
}

public class OverrideMain {
	public static void main(String[] args) {
		System.out.println("this is main method");
		main("Hello");
		Test.printPattern(5);
	}
	
	public static void main(String arg1)
	{
		System.out.println(arg1);
		System.out.println("Override main method with string object one");
		main("java","High Programming");
	}
	public static void main(String arg1, String arg2)
	{
		System.out.println(arg1+" "+arg2);
		System.out.println("Override main method with two string object");
	}
}
