import java.util.*;
class OddNums
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int n = sc.nextInt();
int i;
System.out.println("First"+n+"Odd nos");
for(i=1;i<=n;i++)
{
if(i%2==0)
continue;
else
System.out.println(i);
}
}
}