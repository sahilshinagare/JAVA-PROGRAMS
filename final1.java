import java.lang.*;

class Demo
{
	public int i;
	public final int j = 20;
	public final int k;


	public Demo()
	{
		this.i = 10;
		this.k = 30;

	}

	public void fun()
	{
		i++;
		//j++;   NA
		//k++;     NA

	}
}
class Final1
{
	public static void main(String args[]);
	{
		
		Demo obj = new Demo();

		obj.fun();
		Demo obj2 = new Demo(11,21);
		System.out.println(obj1.j);
		System.out.println(obj1.k);
		System.out.println(obj1.j);
		
		obj2.fun();
	} 
		

}
