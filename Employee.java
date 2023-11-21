import java.util.Scanner;

class Employee1 {
	String name;
	int age;
	int ph_no;
	String address;
	int salary;
  	void print_salary() {
    		System.out.println("Salary of the employee: " + salary);
        }
}

class Officer extends Employee1{
	String specialization; 
}

class Manager extends Employee1{
	String department;	
}


class Employee{
	public static void main(String[] args){
		Officer obj = new Officer();
		Manager obj1 = new Manager();
		obj.name = "Nidhin";
		obj.age = 19;
		obj.ph_no = 828109;
		obj.address = "Hello";
		obj.salary = 100000;
		obj1.name = "Pranav";
		obj1.age = 22;
		obj1.ph_no = 828109;
		obj1.address = "Hello";
		obj1.salary = 100000;
		System.out.println("Name of the Officer: " + obj.name);
		System.out.println("Age of the Officer: " + obj.age);
		System.out.println("Ph_no of the Officer: " + obj.ph_no);
		System.out.println("Address of the Officer: " + obj.address);
		System.out.println("Salary of the Officer: " + obj.salary);
		System.out.println("Name of the Manager: " + obj1.name);
		System.out.println("Age of the Manager: " + obj1.age);
		System.out.println("Ph_no of the Manager: " + obj1.ph_no);
		System.out.println("Address of the Manager: " + obj1.address);
		System.out.println("Salary of the Manager: " + obj1.salary);
	}
}
