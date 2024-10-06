package tp3;

public class véhicule {
	private int count;
	private String marque;
	private String modèle;
	private int année;
	private double prix;
	
	public véhicule (String marque, String modèle, int année, double prix){
		this.count ++;
		this.marque=marque;
		this.année=année;
		this.modèle=modèle;
		this.prix=prix;
	}
	@Override
	public String toString() {
		return "nombre =  "+ count + "|"+ "marque = "+ marque +"|"+ "année = "+ année+"|" + "modéle ="+ modèle+"|" +"prix= "+prix+"\n";
	}
	public void descisVehicule() {
		System.out.println(this);
	}
	
	
	public String  getMarque () {
		return marque;
	}
	public String  getModèle () {
		return modèle;
	}
	public double getPrix () {
		return prix;
	}
	public void   setMarque (  String marque) {
		this.marque=marque;
	}
	public void   setModèle (  String modèle) {
		this.modèle=modèle;
	}
	public void   setprix(  double prix) {
		this.prix=prix;
	}
	public int  getCount () {
		return count ;
	}
	public int  getAnnée () {
		return année ;
	
	}
	
	
	
	
	
	

}