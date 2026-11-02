class B extends A{
	int y;
	B(int x, int y){
		super(x);
		this.y=y;
	}
	void gety(){
		System.out.println("Cz: "+this.y);
	}
}