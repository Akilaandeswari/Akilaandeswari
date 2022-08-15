import java.io.*;
import java.util.Scanner;
class MaxMin
{
public static void main(String args[])
{
int i,len;
int[] m=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("Enter the length of the list");
len = s.nextInt();
System.out.println("Enter the elements of the list");
for(i=0;i<len;i++)
{ 
m[i]=s.nextInt(); 
}
int max=m[0];
int min=m[0];
for(i=0;i<len;i++)
{ 
if(m[i]>max)
{ 
max=m[i]; 
}
if(m[i]<min)
{ 
min=m[i]; 
} 
}
System.out.println("The maximum no. in the list is "+max);
System.out.println("The minimum no. in the list is "+min);
}
}