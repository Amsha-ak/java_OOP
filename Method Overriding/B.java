class B extends A{
	int x=100;
	int y;
	
	
	B(){
		this.y=70;
		
	}
	
	void getY(){
		System.out.println("By: "+this.y);
		super.getX();
	}
	
	void getX(){
		int x=500;
		System.out.println("Local: "+x);
		System.out.println("Bx: "+this.x);
		System.out.println("Bx: "+super.x);
	}
}