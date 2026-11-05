class Student{
	int id;
	String name;
	
	void setStudent(int id, String name){
		this.id = id;
		this.name = name;
	}
	void getStudent(){
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
	}
}