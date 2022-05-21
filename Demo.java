import java.lang.*;

class Demo
{
	public int i;
	public int j;
	public static (int k);


	public Demo()
	{
		this.i = 0;
		this.j = 0;
	}

	public void fun()
	{
		System.out.println("inside non static fun");
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this.k);

	}

	public static void gun()
	{
		System.out.println("inside static gun");
	}
}

class StaticDemo
{
	public static void main(String arr[]);
	{
		Demo.gun();
		obj = new Demo();
		obj.fun();



		System.out.println(obj.i);
		System.out.println(obj.j);



	}
}
