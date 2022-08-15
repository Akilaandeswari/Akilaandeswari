import java.io.*;
import java.util.Scanner;
class PrimeNos
{
public static void main(String args[])
{
int n,m=1;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number ");
n=s.nextInt();
System.out.println("The prime numbers are ");
while(m<n)
{ 
boolean temp=false;
for(int i=2;i<=m/2;++i)
{ 
if(m%i==0)
{ 
temp=true; 
break; 
}
}
if (!temp && m!=0 && m!=1)
{ 
System.out.print(m+ " "); 
}
m++;
}
} 
}