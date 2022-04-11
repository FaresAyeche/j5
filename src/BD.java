
public class BD extends Livre {
	boolean couleur;
	String LeSensDeLecture;
	

	public BD(String titre, String auteur, double prix, int NombreDePage, boolean couleur) {
		super(titre, auteur, prix, NombreDePage);
		this.couleur = couleur;
		this.LeSensDeLecture = "de gauche à droite";
		
	}
		public void BD() {
			this.couleur = true;
}
			public void Afficher() {
				super.Afficher();
				System.out.println(this.LeSensDeLecture);
			

			if (couleur==true) {
			System.out.println("Couleur :couleur");
			}
			else {System.out.println("Couleur:N&B");
			
	}
	
	
	
			}

}
