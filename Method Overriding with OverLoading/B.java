class B extends A{
	int y;
	B(){
		this.y = 70;
	}
	void getX(int y){		//overloading
		System.out.println("By: "+this.y);
		System.out.println("By Local: "+y);
	}
	void getX(){		//overriding
		System.out.println("Bx instance: "+this.x);
	}
}