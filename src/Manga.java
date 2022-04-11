
public class Manga extends Livre {
	boolean couleur;
	String LeSensDeLecture;
	int taille;
	public Manga(String titre, String auteur, double prix, int NombreDePage,boolean couleur,String LeSensDeLecture,int taille) {
		super(titre, auteur, prix, NombreDePage);
		// TODO Auto-generated constructor stub
		this.couleur = false;
		this.LeSensDeLecture = "de droite à gauche ";
		this.taille = taille;
	}
	

}
