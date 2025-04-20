package ab50;
class studentDetails
{
	private int age=20;

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	
}

public class EncapsulationProgram  {

	public static void main(String[] args) 
	{
		studentDetails s1=new studentDetails();
		s1.setAge(28);
		System.out.println(s1.getAge());

	}

}
