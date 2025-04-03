package personnages;

public class Humains {

		public String nom;
		private String boisson;
		public int argent;
		
		public Humains(String nom, String boisson, int argent) {
			this.nom = nom;
			this.boisson = boisson;
			this.argent = argent;
		}
		
		public String direBonjour() {
			return "Bonjour je m'appelle " + nom + " et j'aime boire du " + boisson + ".";
		}
		
		public void boire() {
			parler("Mmh... un bon verre de " + boisson + " ! GLOUPS !");
		}
		
		public void acheter(String bien, int prix) {
			if (argent >= prix) {
				parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'acheter " + bien + " à " + prix + " sous !");
				perdreArgent(prix);
			}else {
				parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux pas m'offir " + bien + " à " + prix + " sous.");
			}
		}
		
		
		
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getBoisson() {
			return boisson;
		}

		public void setBoisson(String boisson) {
			this.boisson = boisson;
		}

		public int getArgent() {
			return argent;
		}

		public void setArgent(int argent) {
			this.argent = argent;
		}

		public void gagnerArgent(int gain) {
			argent += gain;
		}
		
		public void perdreArgent(int perte) {
			argent -= perte;
		}
		
		public void parler(String texte) {
			System.out.println(nom + " : " + texte);
		}
		
		
}
