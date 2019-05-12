package pl.edu.ur.oopl5.companyAndEmployees.company;

import pl.edu.ur.oopl5.companyAndEmployees.company.abstractClasses.AbstractCompany;
import pl.edu.ur.oopl5.companyAndEmployees.employee.Employee;

/**
 */
public class Company extends AbstractCompany {

    Employee[] emo;
    int i = 0;

    public Company(int n) {
        super(n);
        emo = new Employee[n];
    }

    @Override
    public void addEmployee(Employee e) {
        emo[i] = e;
        i++;
    }

    @Override
    public Employee[] getEmployees() {
        return emo;
    }

    @Override
    public void printEmployees() {
        for (Employee employee : emo) {
            employee.toString();
        }
    }
}
