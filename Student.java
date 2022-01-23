package week1.day1;

public class Student {
	String name="Rashmi";
	int rollNumber=12345;
public void college()
{
	String collegeName="Graphic Era University";
	System.out.println(collegeName);
}
public static void main(String[] args)
{
	System.out.println("student details");
	Student obj=new Student();
	obj.college();
	System.out.println(obj.name);
	System.out.println(obj.rollNumber);
}
}
