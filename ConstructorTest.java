import java.util.*;

public class ConstructorTest
{
    public static void main(String[] args)
    {
	Employee[] staff=new Employee[3];

	staff[0]=new Employee("Harry",40000);
	staff[1]=new Employee(60000);
	staff[2]=new Employee();

	for(Employee a:staff)
	    {
		System.out.println("name="+a.getName()+",id="+a.getId()+",salary="+a.getSalary());
	    }
    }
}

class Employee
{
    private static int nextId;

    private int id;
    private String name="";
    private double salary;

    static
    {
	Random generator=new Random();

	nextId=generator.nextInt(10000);
    }

    {
	id=nextId;
	nextId++;
    }

    public Employee(String n,double s)
    {
	name=n;
	salary=s;
    }

    public Employee(double s)
    {
	this("Employee #"+nextId,s);
    }

    public Employee()
    {
      
    }

    public double getSalary()
    {
	return salary;
    }

    public String getName()
    {
	return name;
    }
    public int getId()
    {
	return id;
    }
    
}

