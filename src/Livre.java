
public class Livre {
	String titre ;
	String auteur;
	double prix ;
	int nbrDePage;
	///constructeur
	public Livre(String titre,String auteur,double prix,int nbrDePage) {
		this.titre=titre;
		this.auteur=auteur;
		this.prix=prix;
		this.nbrDePage=nbrDePage;
		
	}
public void Afficher () {
	 System.out.println("titre: " + this.titre);
     System.out.println("auteur: " + this.auteur);
     System.out.println("prix: " + this.prix + " TND");
     System.out.println("Nombre de pages: " + this.nbrDePage);
     System.out.println("------------------------");
}
}




//Un livre est défini par son titre, son auteur, son prix, son nombre de pages et son genre