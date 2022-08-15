import java.io.*;
import java.util.Scanner;
interface A
{
void ShowA();
}
interface B
{
void ShowB();
}
class C implements A,B
{
public void ShowA()
{
System.out.println("ShowA() in interface A is implemented");
}
public void ShowB()
{
System.out.println("ShowB() in interface B is implemented");
}
}
public class MultipleInheritance
{
public static void main(String[] args) 
{
C obj= new C();
obj.ShowA();
obj.ShowB();
}
}