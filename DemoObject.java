class Student
{
int id;
String name;
}
class DemoObject
{
public static void main(String args[])
{
//Declare two varaibles of type Student
Student s1,s2,s3;
s3=null;

//assign memory to s1
s1=new Student();
s1.id=1;
s1.name="java";
s2=s1;//Both s1 and s2 varaibles point the same block of memory
//If I updata any value with s1 whcih will be accessed by both s1 //and s2

System.out.println("S1:"+s1.id+ " "+s1.name);//1,java
System.out.println("S2:"+s2.id+ " "+s2.name);//1,java
//If I updata any value with s2 reference whcih will be accessed by //both s1 and s2

s2.id=2;
s2.name="iii";
System.out.println("S1:"+s1.id+ " "+s1.name);//I,java
System.out.println("S2:"+s2.id+ " "+s2.name);//2,III
s3.id=2000;
}}
