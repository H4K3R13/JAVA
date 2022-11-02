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

class circle extends shape
{
	double radius;
	double pi=3.14;
	circle(double radius,String name)
	{
		this.radius = radius;
		this.name = name;
	}

	double findArea()
	{
		return (this.radius*this.radius)*pi;
	}
}

class inheritance2
{	
	public static void main(String[] args)
	{
		shape s = new shape("Shape 1");
		s.display();

		circle r = new circle(10,"C1");
		System.out.println("Area ="+ r.findArea());
	}
	
}

