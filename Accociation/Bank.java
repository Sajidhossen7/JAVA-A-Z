import java.lang.*;

public class Bank
{
	private String bankName;
	private String branchName;
	private Employee emps[];
	
	public Bank()
	{
		
	}
	
	public Bank(String bankName,String branchName,Employee emps[])
	{
		this.bankName=bankName;
		this.branchName=branchName;
		this.emps=emps;
	}
	
	public void setBankName(String bankName)
	{
		this.bankName=bankName;
	}
	
	public void setBranchName(String branchName)
	{
		this.branchName=branchName;
	}
	
	public void setEmps(Employee emps[])
	{
		this.emps=emps;
	}
	
	public String getBankName()
	{
		return this.bankName;
	}
	
	public String getBranchName()
	{
		return this.branchName;
	}
	
	public Employee[] getEmps()
	{
		return this.emps;
	}
	
	
}