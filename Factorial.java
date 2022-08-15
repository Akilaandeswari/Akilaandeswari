import java.io.*;
import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
int fact,n;
fact=1;
Scanner s = new Scanner(System.in);
System.out.println("Enter a number");
n=s.nextInt();
while(n!=0)
{
fact = fact * n;
n = n - 1;
}
System.out.println("The factorial is " +fact);
}
}