package MyStudent;
public class Student{
	int id;
	String name;
	
	 Student(int id){
		this.id = id;
	}
	
	public Student(int id, String name){
		this(id);
		this.name = name;
	}
	
	public void getStudent(){
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
	}
}