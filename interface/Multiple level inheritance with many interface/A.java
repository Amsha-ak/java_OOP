class A implements IC, ID, IE{
	int x;
	
	A(){
		this.x = 12;
	}
	
	void getX(){
		System.out.println("Ax: "+this.x);
	}
	
	public void getz(){
		System.out.println("ICz: "+Z);
	}
	
	public void getk(){
		System.out.println("IDk: "+K);
	}
	
	public void getl(){
		System.out.println("IEl: "+L);
	}
	
}