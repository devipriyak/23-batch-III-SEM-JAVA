import java.lang.*;
import java.util.*;
class ScannerDemo
{
public static void main(String args[])
{
int rollnumber;
int marks;
String name;
Scanner s=new Scanner(System.in);
System.out.println("Enter roll number and marks,name");
//read roll number from user using s.nexInt()
  rollnumber=s.nextInt();
 marks=s.nextInt();
 name=s.next();
System.out.println(rollnumber+ " "+marks+" "+name);
}
}

