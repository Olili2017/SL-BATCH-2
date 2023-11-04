package devops.sl;

public class MyClass {
	public int sum(int a, int b)
	{
		return a+b;		
	}
	public int diff(int a, int b)
	{
		return a-b;
	}

	public static void main(String[] args) {
		
		MyClass ob = new MyClass();
		int res = ob.sum(10, 20);
		System.out.println("Sum is "+res);

	}

}
