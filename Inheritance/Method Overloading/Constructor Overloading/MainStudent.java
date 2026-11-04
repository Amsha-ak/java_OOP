class MainStudent{
	public static void main(String args[]){
		Student obja1 = new Student();
		obja1.getStudent();
		
		Student obja2 = new Student(2000, "Pirana");
		obja2.getStudent();
		
		Student obja3 = new Student("Jana", 3000);
		obja3.getStudent();
		
		Student obja4 = new Student(4000);
		obja4.getStudent();
		
		Student obja5 = new Student("Yazh");
		obja5.getStudent();
	}
}                                      