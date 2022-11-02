class rectangle{
	//instance variables
	int length, breadth;

	//Constructor
	rectangle(int l,int b){
	length = l;
	breadth = b;
	}

	int area(){
		return length*breadth;
	}

	void display(){
		System.out.println("I Am Rectangle");
	}

}


class geometry2{
	public static void main(String[] args){
		rectangle r = new rectangle(10,30);
		r.display();

		rectangle s = new rectangle(40,99);
		s.display();

		System.out.println("Area2 = "+r.area());
		System.out.println("Area2 = "+s.area());
	}
}
