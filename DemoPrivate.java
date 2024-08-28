class ABC
{
int x=345;
private int y=20;//private member
void display()
{
System.out.println(y);
//Private member y can be access from other member(display())
//of Same ABC class 
}
}
class DemoPrivate
{
public static void main(String a[])
{
//Object of ABC class
ABC o;//Declare object reference variable
o=new ABC();//Assign memory
System.out.println(o.x);//ok
//System.out.println(o.y);//syntax error:private y cant access
//call display()
o.display();
}
}