package SBA;
abstract class Employee {
	String name="Nikita";
	int emp_id=3425;
	abstract float calculateSalary();
	abstract void fetchDepartment();
}

 class Engineer extends Employee {
	 float calculateSalary() {
		 return 4.5f;
	 }
     void fetchDepartment() {
    	 System.out.println("Delivery");
     }
}
 class Doctor extends Employee {
	 float calculateSalary() {
		 return 6.5f;
	 }
	 void fetchDepartment() {
		 System.out.println("cardiology");
	 }
 }
 class Main27 {
	 public static void main(String[] args) {
		// Employee E1=new Employee();
		 Engineer e=new Engineer();
		 Doctor d=new Doctor();
		 System.out.println(e.name);
		 System.out.println(e.emp_id);
		 System.out.println(e.calculateSalary());
		 e.fetchDepartment();
		 System.out.println(d.name);
		 System.out.println(d.emp_id);
		 System.out.println(d.calculateSalary());
		 d.fetchDepartment();
	 }
 }
