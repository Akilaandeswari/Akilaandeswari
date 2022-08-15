import java.io.*;
import java.util.Scanner;
class A
{
int a=3,b=5;
void fun()
{
System.out.println("In base class:\n"+"\tSum="+(a+b));
}
}
class B extends A
{
void fun1()
{
System.out.println("In derived class:\n"+"\tSum="+(a+b));
fun();
}
}
public class SingleInheritance
{
public static void main(String[] args) {
B obj=new B();
obj.fun1();
}
}