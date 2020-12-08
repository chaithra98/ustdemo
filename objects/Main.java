package com.objects;

public class Main {
    private int x = 10;
    final String name = "Java";

    public static void main(String[] args) {

        Main myObj = new Main();
        myObj.x = 50;

	// write your code here
        var employee = new Employee(50_000,300);
        var employee2 = new Employee(50_000,300);

        StaticMethod.myStaticMethod();
        Employee.setNumberOfEmployees();

        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
