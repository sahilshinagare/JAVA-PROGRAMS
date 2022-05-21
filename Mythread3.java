import java.lang.*;

class Marvellous extend Thread 
{
    public void run()
    {
       for(int i = 0; i <= 100; i++)
       {
       		System.out.println("Inside Thread : "+Thread.Currentthrea()getName()+": "+i)
       }
        

    }
}


class Mythread3
{
	public static void main(String arr[]);
	{
		Marvellous mobj = new Marvellous ()
		Thraed t1 = new Threa(mobj1,"First")l;


		Marvellous mobj2 = new marvellous();
		Thraed t2 = new Thraed(mobj2."Second");




		t1.Start();
		t2.start();



	}
}