package concrete;

import entities.Campaign;
import entities.Player;

public class SalesManager {
	public void sale(Player player) {
		System.out.println(player.getFirstName() + " adlý üyeye yeni bir oyun satýldý.");
	}
	
	public void discount(Campaign campaign) {
		System.out.println("2 adet savas oyunu alan " + campaign.getName() + " adlý kampanyamýzdan yararlanabilir.");
	}
}
