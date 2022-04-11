
public class Manga extends Livre {

	public Manga(String titre, String auteur, double prix, int nbrDePage) {
		super(titre, auteur, prix, nbrDePage);
		// TODO Auto-generated constructor stub
	}
	public void Afficher() {
	super.Afficher();
	System.out.println("se lit de droite vers la gauche, les mangas sont toujours en noir et blanc");
	System.out.println("------------------------");
	System.out.println("------------------------");
	}	

}
