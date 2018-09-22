package ch02;
public class Employee {
    private static int last_id = 0;
    private static int last_internship_id = 0;
    private String name;
    private double salary;
    private int id;
    private int internship_id;
    public  Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        //非线程安全
        last_id++;
        id = last_id;
    }
    public Employee(double salary){
        this("Anonymous", salary);
        /***
        this.name = "Anonymous";
        this.salary = salary;
         ***/
    }
    public Employee(String name){
        //实习生默认工资为0;
        this.name = name;
        last_internship_id++;
        internship_id = last_internship_id;
    }
    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary() { return this.salary; }
    public int getId() { return this.id; }
    public int getInternship_id() { return this.internship_id; }
    public static void main(String[] args){
        Employee james_bond = new Employee("James Bond", 200000);
        Employee anonymous = new Employee(400000);
    }
}
