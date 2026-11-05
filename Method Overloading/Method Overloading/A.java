class A{
	int id;
	String name;
	
	void setStudent(){
		this.id = 1000;
		this.name = "Amsha";
	}
	
	void setStudent(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void setStudent(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	void setStudent(int id){
		this.id = id;
		this.name = "Iny";
	}
	
	void setStudent(String name){
		this.id = 5000;
		this.name = name;
	}
	
	void getStudent(){
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
	}
}