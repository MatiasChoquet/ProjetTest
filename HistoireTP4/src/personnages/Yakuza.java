package personnages;

public class Yakuza extends Humains{
	
	private String clan;
	public int reputation = 4;
	
	public Yakuza(String clan, String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		int sous = victime.argent;
		this.argent += sous;
		parler(victime.nom + ", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		parler("J’ai piqué les " + sous + " sous de " + victime.nom + ", ce qui me fait " +  this.argent + " sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		parler("J’ai perdu mon duel et mes " + this.argent + " sous, snif... J'ai déshonoré le clan de " + this.clan + ".");
		this.reputation -= 1;
		return this.argent = 0;
		
	}
	
	public void gagner(int gain) {
		this.argent += gain;
		this.reputation += 1;
		parler("Ce ronin pensait vraiment battre " + this.nom + " du clan de " + this.clan + ". Je l'ai dépouillé de ses " + gain + " sous.");
		}
	
}
