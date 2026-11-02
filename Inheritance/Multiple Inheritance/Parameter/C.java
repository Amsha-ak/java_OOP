class C extends B{
	int z;
	C(int x, int y, int z){
		super(x,y);
		this.z=z;
	}
	void getz(){
		System.out.println("Cz: "+this.z);
	}
}