package personnages;

public class Ronin extends Humains{
	
	private int reputation = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = this.argent/10;
		parler(beneficiaire.nom + " prends ces " + don + " sous.");
		beneficiaire.recevoirArgent(don);
		this.argent -= don;
	}
	
	public void provoquer(Yakuza adversaire) {

		if (this.reputation >= adversaire.reputation) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			this.argent += adversaire.argent;
			parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
		}else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(this.argent);
			this.argent = 0;
		}
	}

}
