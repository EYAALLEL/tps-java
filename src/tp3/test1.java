package tp3;

public class test1{

	public static void main(String[] args) {
		{
			
			
			véhicule v1= new véhicule("clio","classique",2000,20.000);
			véhicule v2= new véhicule("mercedes","fântome",2008,60.000);
			véhicule v3= new véhicule("kia","picanto",2012,35.000);
			AgenceMobilière tab = new AgenceMobilière(5);
			tab.ajoutVéhicule(v1);
			tab.ajoutVéhicule(v2);
			tab.ajoutVéhicule(v3);
			tab.affiche();
			tab.selection(35.000);
			tab.selection("clio");
			tab.selection(2);
			tab.plusancienne() ;
			
			
			
			
			}
		// TODO Auto-generated method stub

	}}


