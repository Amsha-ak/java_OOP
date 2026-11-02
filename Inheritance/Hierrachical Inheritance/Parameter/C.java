class C extends A{
	int z;
	C(int x, int z){
		super(x);
		this.z=z;
	}
	void getz(){
		System.out.println("Cz: "+this.z);
	}
}