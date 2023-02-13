package mar9_Poly;

public class Emp {

	void empSalary() {
		System.out.println("===");
		System.out.println("Salary of the emp is " + 10000);
	}

	void empSalary(int salary) {
		System.out.println("===");
		System.out.println("Salary of the emp is " + salary);
	}

	void empSalary(int salary, int bonus) {
		System.out.println("===");
		int tot_salary = salary + bonus;
		System.out.println("Salary of the emp is " + tot_salary);
	}

	void empSalary(int salary, int bonus, String promotion) {
		System.out.println("===");
		int tot_salary = salary + bonus;
		System.out.println("Salary of the emp is " + tot_salary);
		System.out.println("Emp got promotion");
	}

	void empSalary(String promotion, int salary, int bonus) {
		System.out.println("===");
		int tot_salary = salary + bonus;
		System.out.println("Salary of the emp is " + tot_salary);
		System.out.println("Emp got promotion");
	}

	int empSalary(int salary, String promotion, int bonus) {
		System.out.println("===");
		int tot_salary = salary + bonus;
		System.out.println("Salary of the emp is " + tot_salary);
		System.out.println("Emp got promotion" + promotion);
		return tot_salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary = 15000;
		Emp obj = new Emp();
		obj.empSalary();
		obj.empSalary(salary);
		obj.empSalary(salary, 1500);
		obj.empSalary(salary, 1500, "Senior Teacher");
		obj.empSalary("Senior Teacher", salary, 1500);
		int tot_salary = obj.empSalary(salary, "Senior Teacher", 1500);
		System.out.println(tot_salary);

	}

}
