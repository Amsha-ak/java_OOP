class MainA{
	public static void main(String args[]){
		A obja1 = new A();
		obja1.setStudent();
		obja1.getStudent();
		
		A obja2 = new A();
		obja2.setStudent(2000, "Pirana");
		obja2.getStudent();
		
		A obja3 = new A();
		obja3.setStudent("Jana", 3000);
		obja3.getStudent();
		
		A obja4 = new A();
		obja4.setStudent(4000);
		obja4.getStudent();
		
		A obja5 = new A();
		obja5.setStudent("Yazh");
		obja5.getStudent();
	}
}                                      