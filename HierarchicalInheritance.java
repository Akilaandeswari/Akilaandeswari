import java.io.*;
import java.util.Scanner;
class A
{
void display()
{
System.out.print("Base class\n");
}
}
class B extends A
{
void display1()
{
System.out.println("Derived class 1");
System.out.print("\tAccessing base class function from Derived class 1: "); display();
}
}
class C extends A
{
void display2()
{
System.out.println("Derived class 2");
System.out.print("\tAccessing base class function from Derived class 2: "); display();
}
}
public class HierarchicalInheritance
{
public static void main(String[] args) 
{
B obj1=new B();
C obj2=new C();
obj1.display1();
obj2.display2();
}
}