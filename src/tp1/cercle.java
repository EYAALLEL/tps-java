package tp1;


public class cercle{
	Point centre;
	double rayon;
	public cercle(Point P , double r){
		this.centre =P;
		this.rayon=r;
	}
	void afficher() {
		System.out.println("le point centre de cordonné "+centre.toString()+" et de rayon :" + rayon );
	}
	void deplacer(int a, int b) {
		centre.deplacer(a, b);
	}
	 static boolean coincide(cercle c1,cercle c2) {
	 return c1.centre.coïncide_V1(c2.centre) &&  c1.rayon==c2.rayon;

	}
	
	

}
