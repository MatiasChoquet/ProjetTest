package histoire;

import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humains prof = new Humains("Prof", "kombucha", 54);
		prof.parler(prof.direBonjour());
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		Commercant marco = new Commercant("Marco", "thé", 20);
		marco.parler(marco.direBonjour());
		marco.seFaireExtorquer();
		marco.recevoirArgent(30);
		marco.boire();
		Yakuza yaku = new Yakuza("Warsong","Yaku le noir", "whisky", 10);
		yaku.parler(yaku.direBonjour());
		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		yaku.extorquer(marco);
		Ronin roro = new Ronin("Roro", "sochu", 60);
		roro.parler(roro.direBonjour());
		roro.donner(marco);
		roro.provoquer(yaku);
		yaku.reputation = 0;
	}
}
