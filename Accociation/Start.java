import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Employee e1=new Employee(101,5000.0);
		Employee e2=new Employee(102,15000.0);
		Employee e3=new Employee(103,25000.0);
		
		Employee empList[]=new Employee[3];
		
		empList[0]=e1;
		empList[1]=e2;
		empList[2]=e3;
		
		Bank b=new Bank("Dhaka Bank","Mirpur-10", empList);
	}
}