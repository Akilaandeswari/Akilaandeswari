import java.io.*;
import java.util.Scanner;
class one
{
void fun1()
{
System.out.println("Base class");
}
}
class two extends one
{
void fun2()
{
System.out.println("Derived class of base class");
}
}
class three extends two
{
void fun3()
{
System.out.println("Derived class of derived class");
}
}
public class MultilevelInheritance
{
public static void main(String[] args) 
{
three obj1=new three();
obj1.fun1();
obj1.fun2();
obj1.fun3();
}
}