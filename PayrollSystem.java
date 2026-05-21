import java.util.ArrayList;

public class PayrollSystem
{
    private ArrayList<Employee> employeeArrayList;
    public PayrollSystem()
    {
        employeeArrayList = new ArrayList<>();
    }
    public void addEmployee(Employee employee)
    {
        employeeArrayList.add(employee);
    }
    public void removeEmployee(int id)
    {
        Employee employeeToRemove = null;
        for(Employee employee : employeeArrayList)
        {
            if(employee.getId()==id)
            {
                employeeToRemove=employee;
                break;
            }
        }
        if(employeeToRemove != null)
        {
            employeeArrayList.remove(employeeToRemove);
        }
    }
    public void displayEmployees()
    {
        for(Employee employee : employeeArrayList)
        {
            System.out.println(employee);
        }
    }
}
