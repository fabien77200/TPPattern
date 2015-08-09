package domaine;

public abstract class Tartiflette {

	private String nom;
	
	public Tartiflette(String nom){
		this.nom=nom;
	}
	
	public void faireTartiflette() {
		
		avantTout();
		cuirePommesTerre();
		cuireLardons();
		ajouterFromage();
		ajouterSpecialitesReg();
		ajouterCremeFraiche();
		ajouterHuile();
		ajouterOignons();
		cuirePlat();

	}
	
	public void avantTout(){
		System.out.println("\nPréparer les ingrédients pour réaliser la Tartiflette "+nom);
	}

	public void cuirePommesTerre() {
		System.out.println("préparer et faire cuire 1,2 kg de pommes de terre");

	};

	public void cuireLardons() {
		System.out.println("ajouter 200 g de lardons fumés");
	};

	public abstract void ajouterFromage();

	public abstract void ajouterSpecialitesReg();

	public void ajouterCremeFraiche() {
		System.out.println("compléter le plat de 2 cuillères à soupe de crème fraîche");

	};

	public void ajouterHuile() {
		System.out.println("1 cuillère à soupe d'huile");
	};

	public void ajouterOignons() {
		System.out.println("couper et ajouter 2 oignons jaunes");

	};

	public void cuirePlat() {
		System.out.println("enfourner 15-20 minutes à 200 °C, chaleur tournante.");

	};
}
