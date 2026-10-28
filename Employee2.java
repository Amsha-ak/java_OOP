class Employee2{
	int id;
	String name;
	double basicSalary;
	//double bonus;
	
	void setEmployee2(){
		this.id = 1000;
		this.name = "Amshajiny";
		this.basicSalary = 300000;
	}
	
	double calcBonus(){
		double bonus = 0.0;
		if(this.basicSalary>=100000){
			bonus = (this.basicSalary/100)*10;
		}
		else{
			bonus = (this.basicSalary/100)*5;
		}
		return bonus;
	}
	
	void display(){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+this.basicSalary);
		double b =this.calcBonus();
		System.out.println("Bonus: "+b);
		System.out.println("Net Salary: "+(b+this.basicSalary));
	}
	
	
}