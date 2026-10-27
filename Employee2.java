class Employee2{
	int id;
	String name;
	double basicSalary;
	double bonus;
	
	void setEmployee2(){
		id = 1000;
		name = "Amshajiny";
		basicSalary = 300000;
	}
	
	void calcBonus(){
		if(basicSalary>=100000){
			bonus = (basicSalary/100)*10;
		}
		else{
			bonus = (basicSalary/100)*5;
		}
	}
	
	void display(){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+basicSalary);
		System.out.println("Bonus: "+bonus);
		System.out.println("Net: "+(basicSalary+bonus));
	}
	
	
}