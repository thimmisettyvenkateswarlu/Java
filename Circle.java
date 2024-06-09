class Circle 
{
	double radius;
	static double pi=31.4;
	
	 public Circle(double radius)
	 {
	 	this.radius=radius;
	 }
	 public void areaofcircle()
	 {
	 	System.out.println("areaofcircle:"+pi*this.radius*this.radius);
	 }
}
class AreaofCircle
{
	public static void main(String [] args)
	{
		Circle c1=new Circle(25.5);
		c1.areaofcircle();
		Circle c2=new Circle(49.9);
		c2.areaofcircle();
	}
}