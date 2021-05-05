package concrete;

import entities.Campaign;
import entities.Player;

public class SalesManager {
	public void sale(Player player) {
		System.out.println(player.getFirstName() + " adl� �yeye yeni bir oyun sat�ld�.");
	}
	
	public void discount(Campaign campaign) {
		System.out.println("2 adet savas oyunu alan " + campaign.getName() + " adl� kampanyam�zdan yararlanabilir.");
	}
}
