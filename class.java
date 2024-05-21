public class Gun
{
	private String gname;
	private int bullets;
	public Gun(String gname,int bullets)
	{
		this.gname=gname;
		this.bullets=bullets;
	}
	public String getShoot()
	{
		return gname+" "+bullets;
	}
	public static void main(String [] args)
	{
		Gun g1=new Gun("Ak47",15);
		System.out.println(g1.getShoot());
		
		Gun g2= new Gun("mk14",10);
		System.out.println(g2.getShoot());
	}
}