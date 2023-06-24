package ExampleAbstractClass;

public class Ex1 {
	public static void mesaiBasla(Calisan[] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			c[i].calis();
		}
	}
	
	public static void main(String[] args) {
		Calisan[] c = new Calisan[2];
	//	c[0] = new Calisan(); // 'abstract class' --> no 'new'
		c[0] = new Mudur();
		c[1] = new Programci();
		mesaiBasla(c);
	}

}
