class shape
{
	String name;

	shape(String name)
	{
		this.name = name;
	}

	shape()
	{
		this.name = "No Name";
	}
	
	void display()
	{
		System.out.println("Name " + this.name);
	}
}

class rectangle extends shape
{
	int length,breadth;
	rectangle(int length,int breadth,String name)
	{
		this.length = length;
		this.breadth = breadth;
		this.name = name;
	}

	int findArea()
	{
		return this.length*this.breadth;
	}
}

class inheritance
{	
	public static void main(String[] args)
	{
		shape s = new shape("Shape 1");
		s.display();

		rectangle r = new rectangle(10,20,"R1");
		System.out.println("Area ="+ r.findArea());
	}
	
}

