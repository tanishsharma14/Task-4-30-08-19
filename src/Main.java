import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);
		ArrayList<Employee> alist=new ArrayList<>();
		
		System.out.println("Please choose one of the option");
		int input;
		do
		{
			System.out.println("1. Add employee");
			System.out.println("2. View all employees");
			System.out.println("3. Remove employee");
			System.out.println("4. Clear data");
			System.out.println("5. Change salary");
			System.out.println("6. Search employee");
			System.out.println("7. View department wise list");
			System.out.println("8. Exit");
			
			input=sc.nextInt();
			
			switch(input)
			{
			case 1:
				{
					int empno;
					String ename;
					int salary;
					String desg;
					String dept;
					
					System.out.println("Enter employee no");
					empno=sc.nextInt();
					System.out.println("Enter employee name");
					ename=sc.next();
					System.out.println("Enter salary");
					salary=sc.nextInt();
					System.out.println("Enter designation");
					desg=sc.next();
					System.out.println("Enter department");
					dept=sc.next();
					
					Employee e=new Employee(empno,ename,salary,desg,dept);
					alist.add(e);
					System.out.println("Employee added successfully");
					System.out.println();
					break;
				}
				
			case 2:
			{
				System.out.println("All the employees details");
				for(Employee s:alist)
				{
					System.out.println(s.toString());
				}
				System.out.println();
				break;
			}
			
			case 3:
				{
					System.out.println("Enter employee no");
					int eno=sc.nextInt();
					boolean flag=false;
					for(int i=0;i<alist.size();i++)
					{
						if(alist.get(i).getEmpno()==eno)
						{
							alist.remove(i);
							flag=true;
						}
					}
					
					if(flag==true)
						System.out.println("Employee record removed successfully");
					else
						System.out.println("Emplouee not found");
					
					System.out.println();
					break;
				}
				
			case 4:
			{
				alist.clear();
				System.out.println("All data cleared");
				System.out.println();
				break;
			}
			
			case 5:
			{
				System.out.println("Enter employee no");
				int eno=sc.nextInt();
				System.out.println("Enter new salary");
				int sal=sc.nextInt();
				boolean flag=false;
				for(int i=0;i<alist.size();i++)
					{
						if(alist.get(i).getEmpno()==eno)
						{
							alist.get(i).setSalary(sal);
							System.out.println("Salary updated successfully");
							flag=true;
						}
					}
				
				if(flag==false)
					System.out.println("Employee bot found");
				
				System.out.println();
				break;
			}
			
			case 6:
				{
					System.out.println("Enter employee number");
					int eno=sc.nextInt();
					boolean flag=false;
					for(int i=0;i<alist.size();i++)
					{
						if(alist.get(i).getEmpno()==eno)
						{
							System.out.println(alist.get(i).toString());
							flag=true;
						}
					}
					
					if(flag==false)
						System.out.println("Employee not found");
					
					System.out.println();
					break;
				}
				
			case 7:
			{
				System.out.println("Enter the department name");
				System.out.println("CS");
				System.out.println("IT");
				System.out.println("MECH");
				System.out.println("CIVIL");
				
				String d=sc.next();
				for(int i=0;i<alist.size();i++)
				{
					if(alist.get(i).getDept().equalsIgnoreCase(d))
					{
						System.out.println(alist.get(i).toString());
					}
				}
				
				System.out.println();
				break;
			}
			
			default :
			{
				System.out.println("Please enter correct value");
						
			}
			}
			
		}while(input!=8);
		

	}

}
