import java.lang.*;

class Demo
{
	public int i;
	public int j;

	public Demo()
	{
		this.i = 0;
		this.j = 0;

	}

	public Demo(int x,int y)
	{
		this.i = x;
		this.j = y;

	}

	public void fun()
	{
		System.out.println("inside fun");

	}
	public void gun()
	{
		System.out.println("inside gun");

	}
}

class Marvellous 
{
	public static void main(String args[]); 
	{
		System.out.println("inside main");
		Demo obj = new De
		o();
		obj.fun();
		obj.gun();
		System.out.println(obj.i);

		Demo objx = new Demo(11,21);
		objx.fun();
		objx.gun();
		System.out.println(objx.i);
		

		


	}
	
}