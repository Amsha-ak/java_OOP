class Student{
	int id;
	String name;
	
	Student(){
		this.id = 1000;
		this.name = "Amsha";
		
	}
	
	 Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	 Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	 Student(int id){
		this.id = id;
		this.name = "Iny";
	}
	
	 Student(String name){
		this.id = 5000;
		this.name = name;
	}
	
	 void getStudent(){
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
	}
}