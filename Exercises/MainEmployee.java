class MainEmployee{
	public static void main(String args[]){
		Employee Emp1;
		Emp1 = new Employee();
		Emp1.setEmployee(1000, "Amshajiny", 300000);
		Emp1.calcBonus();
		Emp1.display();
		
		Employee Emp2;
		Emp2 = new Employee();
		Emp2.setEmployee(1002, "Piranavi", 500000);
		Emp2.calcBonus();
		Emp2.display();
	}
}