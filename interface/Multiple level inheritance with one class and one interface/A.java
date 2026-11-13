class A extends B implements IC{
	int x;
	
	A(){
		this.x = 12;
	}
	
	void getX(){
		System.out.println("Ax: "+this.x);
	}
	
	void getY(){
		System.out.println("By: "+this.y);
	}
	
	public void getZ(){
		System.out.println("ICz: "+Z);
	}
	
}