
public class BD extends Livre {
Boolean couleur;
//String sens;

	public BD(String titre, String auteur, double prix, int nbrDePage,Boolean couleur) {
		super(titre, auteur, prix, nbrDePage);
		// TODO Auto-generated constructor stub
		this.couleur=false;
		//this.sens="de gauche à droite";
	}
	public void Afficher () {
		super.Afficher();
		if(couleur==true) {
			System.out.println("BD avec couleur");}
			else {
				System.out.println("BD avec noire et blanc");
			}
		 System.out.println("Se lit de gauche à droite");
			System.out.println("------------------------");
			System.out.println("------------------------");
			}
			
			
			
		
	}
	
	
	
	

