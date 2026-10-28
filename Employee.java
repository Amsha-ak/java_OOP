class Employee{
	int id;
	String name;
	double basicSalary;
	double bonus;
	
	void setEmployee(int id, String name, double basicSalary){
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	void calcBonus(){
		if(this.basicSalary>=100000){
			this.bonus = (this.basicSalary/100)*10;
		}
		else{
			this.bonus = (this.basicSalary/100)*5;
		}
	}
	
	void display(){
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.basicSalary);
		System.out.println("Bonus: "+this.bonus);
		System.out.println("Net: "+(this.basicSalary+this.bonus));
	}
	
	
}