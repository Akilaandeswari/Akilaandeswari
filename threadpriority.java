import java.io.*;
import java.util.Scanner;
class A extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("i="+i);
}
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=10;j++)
{
System.out.println("j="+j);
}
}
}
class C extends Thread
{
public void run()
{
for(int k=1;k<=10;k++)
{
System.out.println("k="+k);
}
}
}
class threadpriority
{
public static void main(String args[])
{
A thA = new A();
B thB = new B();
C thC = new C();
thA.setPriority(1);
thB.setPriority(3);
thC.setPriority(9);
thA.start();
thB.start();
thC.start();
System.out.println("End of main");
}
}