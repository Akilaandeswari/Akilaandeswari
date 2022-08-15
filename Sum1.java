import java.io.*;
import java.util.Scanner;
public class Sum1
{
public static void main(String args[])
{
int r,n;
int sum=0;
Scanner ss=new Scanner(System.in);
System.out.println("Enter a number");
n=ss.nextInt();
while(n>0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
System.out.println("the sum of digits of given number is"+sum);
}
}