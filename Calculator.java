import java.lang.*;
import java.util.*;



class Calculator{
    public static void add(int a, int b, int c, int d){
        int e = a+b+c+d;
        System.out.println(e);

    }
    public static void subs(int a, int b, int c, int d,int e){
        int f = a-b-c-d-e;
        System.out.println(f);

    }
    public static void multiply(int a, int b, int c, int l,int h){
        int n = a*b*c*l*h;
        System.out.println(n);

    }
    public static void division(int x,int y){      //formal method
        int z = x/y;
        System.out.println(z);

    }

    public static void main(String[]args){
        System.out.println("Method begin");  //actual method
        //call mehod
        add(10,-34,90,50);  //actual method 
        subs(-89,0,87,98,79);
        multiply(9,89859,878948,8788,89);
        division(90,8);

        System.out.println("Method end");
    }
    
}