import java.io.*;
import java.util.Scanner;
class Seq
{
public static void main(String[] args)
{
int i,n;
Scanner s = new Scanner(System.in);
System.out.println("Enter a number");
n=s.nextInt();
System.out.println("The normal sequence is: ");
for(i=0;i<=n;i++)
{
System.out.print(i+" ");
}
System.out.println("\n The odd sequence is:");
for(i=0;i<=n;i+=2)
{
System.out.print(i+" ");
}
System.out.println("\n The even sequence is:");
for(i=1;i<=n;i+=2)
{
System.out.print(i+" ");
}
}
}