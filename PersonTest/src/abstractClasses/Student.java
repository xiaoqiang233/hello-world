package abstractClasses;

public class Student extends Person{

	private String major;
	
	/**
	 * @param n the student's name
	 * @param m the student's major
	 */
	
	public Student(String n,String m)
	{
		super(n);
		major=m;
	}
	
	public String getDescription()
	{
		return String.format("a stuendt major in $s", major);
	}
}
