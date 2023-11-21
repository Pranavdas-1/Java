class Employee{
	void display(){
		System.out.println("Name of the Class is Employee");
	}
	void calcSalary(){
		System.out.println("Salary of the Employee is 10000");
	}
}
class Engineer extends Employee{
	void display(){
		System.out.println("Name of the Class is Engineer");
		super.display();
	}
	void calcSalary(){
		System.out.println("Salary of the Employee is 20000");
		super.calcSalary();
	}
}
class engi{
	public static void main(String args[]){
		Engineer ob=new Engineer();
		ob.display();
		ob.calcSalary();
	}
}
