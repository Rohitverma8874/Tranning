package io;

public class Employee{

    public static void main(String args[]) {


        EmployeeDetails emp = new EmployeeDetails();

        emp.setEmp_id(101);
        emp.setName("Rohit");
        emp.setDepartment("IT");
        emp.setSalary(15000);
        emp.setAddress("New Delhi");


        System.out.println(emp);


        int sal = emp.getSalary();
        int increment = 0;

        if ((sal >=1000) && (sal <=1500))
        {

            increment += (sal * 2)/100;
            sal = sal+increment;

            emp.setSalary(sal);
            System.out.println("\n Salary is incremented \n");
            System.out.println(emp);

        }else if ((sal >=1500) && (sal <=20000)){

            increment += (sal * 5)/100;
            sal = sal+increment;

            emp.setSalary(sal);
            System.out.println("\n Salary is incremented \n");
            System.out.println(emp);
        }else {
            System.out.println("\n Salary is not incremented \n");
            System.out.println(emp);
        }
    }
}