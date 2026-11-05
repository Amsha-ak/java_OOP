class Student2{
	int id;
	String name;
	int m1;
	int m2;
	int m3;
	
	void setStudent2(int id, String name, int m1, int m2, int m3){
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	int calTotal(){
		int total = 0;
		total = m1+m2+m3;
		return total;
	}
	
	double calAverage(){
		double average =0.0;
		average =(m1+m2+m3)/3;
		return average;
	}
	
	char getResult(){
		char grade;
		double a=this.calAverage();
		if((a>=75) && (a<=100)){
			grade='A';
		}
		else if((a>=65) && (a<=74)){
			grade='B';
		}
		else if((a>=55) && (a<=64)){
			grade='C';
		}
		else if((a>=45) && (a<=54)){
			grade='S';
		}
		else if((a>=0) && (a<=44)){
			grade='F';
		}
		else{
			grade='?';
		}
		
		return grade;
		
	}
	
	void display(){
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Marks1: "+this.m1);
		System.out.println("Marks2: "+this.m2);
		System.out.println("Marks3: "+this.m3);
		int t = this.calTotal();
		System.out.println("Total: "+t);
		double a = this.calAverage();
		System.out.println("Average: "+a);
		char g =this.getResult();
		System.out.println("Grade: "+g);
		
	}
}