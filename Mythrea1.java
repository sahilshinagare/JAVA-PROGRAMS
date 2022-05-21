import java.lang.*;

class Mythrea1
{
	public static void main(String arr[])
	{
		System.out.println("Inside Main");



		Thread tobj = Thread.currentThread();

		System.out.println("Name of current thread is : "+tobj.getName());
	}
}