package id.ac.polban.employee;

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        Department dept = new Department("Teknik Informatika");
        EmploymentType type = new EmploymentType("Full-time");

        Employee emp1 = new Employee("Aulia Rahmi Taufik", dept, type, 5000000);
        Employee emp2 = new Employee("Kyla Khansa", dept, type, 4500000);

        System.out.println("Total Employee: " + Employee.getTotalEmployee());
        System.out.println("Employee 1: " + emp1.getName() + " | ID: " + emp1.getId() + " | Salary: " + emp1.getSalary());
        System.out.println("Employee 2: " + emp2.getName() + " | ID: " + emp2.getId() + " | Salary: " + emp2.getSalary());

        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        service.raiseSalary(emp1.getId(), 10);
        System.out.println("Salary after raise (Employee 1): " + emp1.getSalary());
    }
}

