import java.lang.*;
class Employee implements Cloneable
{
	public int Eid;
	public String Ename;
	public int Esalary;

	public Employee(int id, String str,int no)
	{

		this.EiD = id;
		this.Ename = str;
		this.Esalary =no;
	}

	public Object clone() throws Cloneable
	{
		return super.clone();
	}
}


class copy
{
	public static void main(String arg[])
	{
		Employee eobj = new Employee(11,"piyush",21000);
		System.out.println("EID :"+eobj EID+ "Name :"+ "Salary :"+eobj.ESalary);

		try
		{
		Employee eobjX =  (Employee)eobj.clone();
		System.out.println("EID :"+eobj EID+ "Name :"+ "Salary :"+eobj.ESalary);
		}

		catch
		{
		eobj.Ename = "Shubham";
		System.out.println("EID :"+eobj EID+ "Name :"+ "Salary :"+eobj.ESalary);
	    }
	}
}