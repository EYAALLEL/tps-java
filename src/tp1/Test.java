package tp1;

public class Test {

	public static void main(String[] args) {
		Point p1=new Point(2,3,'A');
		Point p2=new Point(7,5,'B');
		Point p3=new Point();
		Point p4=new Point(p1);
		
		
		p1.afficher();
		p1.deplacer(2, 3);
		p1.afficher();
		p2.afficher();
		p2.deplacer(2, 3);
		p2.afficher();
		p3.afficher();
		p4.afficher();
		System.out.println(p1);
		p1.coïncide_V1(p2);
		System.out.println(p1.coïncide_V1(p2));
		Point.coincide_V2(p1, p2);
		System.out.println(Point.coincide_V2(p1, p2));
		cercle c1 = new cercle(p1,10);
		cercle c2 = new cercle(p2,12.5);
		c1.afficher();
		c2.afficher();
		System.out.println(cercle.coincide(c1,c2));
		c1.deplacer(5, 8);
		c1.afficher();
		
		
		
		
		
		
		
		
		
		
	}

}
