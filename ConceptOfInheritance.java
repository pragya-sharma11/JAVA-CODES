class car
{
int a;
String c;
car(int aa,String cc)
{
a=aa;
c=cc;
}
void display()
{
System.out.println(c+a);
System.out.println("learning java");
}
}
class inheritClass extends car
{
inheritClass(int aa,String cc)
{
Super.car();
}
void ibm()
{
System.out.print("My name is pragya");
}
}
class ConceptOfInheritance
{
public static void main(String args[])
{
inheritClass ob=new inheritClass(45,"pragya");
ob.ibm();
}
}
