public class Main
{
    public static void main(String[] args)
    {
        PayrollSystem payrollSystem=new PayrollSystem();
        FullTimeEmployee emp1=new FullTimeEmployee("Ram",1,100000);
        PartTimeEmployee emp2=new PartTimeEmployee("Sita",2,40,125.70);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployees();
        System.out.println("Removing Employees");
        payrollSystem.removeEmployee(2);
        System.out.println("Remaining Employees Details: ");
        payrollSystem.displayEmployees();
    }
}
