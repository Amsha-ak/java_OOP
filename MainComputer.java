class MainComputer{
	public static void main(String args[]){
		Computer A;
		A = new Computer();//Creating an object
		A.colour = "Black";
		A.brand = "Acer";
		A.price = 450000;
		A.RAM = 512;
		A.processor = "i9"                                                                                                 ;
	
		A.code();
		System.out.println ("A colour: "+A.colour);
		
		Computer B;
		B = new Computer();
		B.colour = "Grey";
		B.brand = "HP";
		B.price = 200000;
		B.RAM = 512;
		B.processor = "i5";
		
		B.game();
		System.out.println("B colour: "+B.colour);
		
		Computer C;
		C = new Computer();
		C.colour = "White";
		C.brand = "Asus";
		C.price = 300000;
		C.RAM = 256;
		C.processor = "i3";
		
		C.movie();
		System.out.println("C colour: "+C.colour);
	}
}