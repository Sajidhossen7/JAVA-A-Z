import java.lang.*;

public class Employee
{
	private int empId;
	private double salary;
	
	public Employee()
	{
	}
	
	public Employee(int empId, double salary)
	{
		this.empId=empId;
		this.salary=salary;
	}
	
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public int getEmpId()
	{
		return this.empId;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	
}