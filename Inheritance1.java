import java.lang.*;






class Inheritance1

{

	static
	{
		System.out.println("inside static block");
	}
	public static void main(String args[])
	{
		System.out.println("inside main");
		Derived dobj = new Derived();
		dobj.fun();
		dobj.fun(11);
		dobj.gun();
		dobj.sun();

	}
}

class Base
{
	public int i;
	public int j;



	public Base()
	{
		System.out,println("inside base constructor");

	}

	public void fun(int x)
	{
		System.out.println("inside base fun with integer");
	}


	public void gun()
	{
		System.out.println("inside base gun");
	}
}


class Derived extends Base

{
	public int x;
	public int y;

	publiic Derived()

	{
		System.out.println("inside derived constructor");
	}

	public void sun()
	{
		System.out.println("inside derived sun");
	}


}
