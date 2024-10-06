package tp1;

public class Point {
	int abs;
	int ord;
	char nom;
	void afficher(){
		System.out.println(nom+"("+abs+","+ord+")");
	}
	void deplacer(int a, int b) {
		abs+=a;
		ord+=b;
		
	}
	void reset() {
		abs=0;
		ord=0;
	}
	public Point(int a ,int o,char n) { 
		abs=a;
		ord=o;
		nom=n;
	}
	public Point() {
		nom = 'o';
		
	}
	public Point(Point P) {
		abs=P.abs;
		ord=P.ord;
		nom=P.nom;
	}
	@Override
	public String toString () {
		return (nom+"("+abs+","+ord+")");
	}
	boolean coïncide_V1 (Point p) {
		
		if (p.nom == nom && p.abs==abs && p.ord==p.ord)
			return true;
		else 
			return false;
			
		
		
	}
	 static boolean coincide_V2(Point a, Point b) {
		if (a.nom ==b.nom && a.abs==b.abs && a.ord==b.ord)
			return true;
		else 
			return false;
			
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
