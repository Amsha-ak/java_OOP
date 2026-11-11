final class A{
	static final int X = 70;
	A(){
		//X=10;
	}
	final void getx(){
		final int x=50;  //local variable
		System.out.println("AX: "+A.X);
	}
}