
public class Livre {
	
String titre;
String auteur;
double prix ;
int NombreDePage;


//CONSTRUCTEUR
public Livre(String titre, String auteur, double prix, int NombreDePage) {
	super();
	this.titre = titre;
	this.auteur = auteur;
	this.prix = prix;
	this.NombreDePage = NombreDePage;
}
public void Afficher() {
    System.out.println("Titre: " + this.titre);
    System.out.println("Auteur: " + this.auteur);
    System.out.println("Prix: " + this.prix + " TND");
    System.out.println("Nombre de pages: " + this.NombreDePage);
    System.out.println("------------------------");
}

}