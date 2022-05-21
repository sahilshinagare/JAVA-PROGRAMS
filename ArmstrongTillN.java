import java.util.Scanner;


//Sahil krushna Shinagare

class ArmstrongTillN
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int cube,d,no,sum=0,i,n;
System.out.println("Enter a number : ");
no = sc.nextInt();
for (i=1;i<=no;i++)
{
n=i;
while (n>0)
{
d=n%10;
cube=d*d*d;
sum=sum+cube;
n=n/10;
}
if (sum==i)
{
System.out.print(i+" ");
}
sum=0;
}
}
}