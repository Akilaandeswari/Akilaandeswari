package p1;
class factorial
{
public int fact(int n)
{
if(n<=1)
return 1;
else
return n*fact(n-1);
}
}
import p1.*;
public class packdemo
{
public static void main(String args[])
{
sairam obj = new sairam();
System.out.println(obj.fact(5));
}
}
