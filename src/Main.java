
public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 Livre l1 = new Livre("Le petit prince","StExupéry",10.40, 50) ;
		 l1.Afficher();
		 
		 BD bd1 =new BD("Lucky Luke","Morris",10.40, 45, true);
		 bd1.Afficher();
		 Manga m1=new Manga("naruto","un aut",40,80);
		 m1.Afficher() ;
		Roman r1 = new Roman("Dora", "Dora", 3.5f, 300);
        r1.setNbChapitre(12);
        r1.setDescription("Une description quelconque");
	}

}
