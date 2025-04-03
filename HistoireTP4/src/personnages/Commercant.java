package personnages;

public class Commercant extends Humains{

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	public int seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return this.argent = 0;
	}
	
	public void recevoirArgent(int don) {
		parler(don + " sous ! Je te remercie généreux donateur!");
		this.argent += don;
	}
}
