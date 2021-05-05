package homework3;

import abstracts.Logger;
import concrete.CampaignManager;
import concrete.PlayerManager;
import concrete.SalesManager;
import entities.Campaign;
import entities.Player;
import log.IdentityDateLogger;
import log.NameSurnameLogger;


public class Main {

	public static void main(String[] args) {
		/*
		 * Player player1 = new Player(1, "Göksu", "Yýlmaz", 26, "99999999999",
		 * "01.09.1994");
		 * 
		 * PlayerManager playerManager = new PlayerManager();
		 * playerManager.add(player1);
		 */
		
       Logger[] loggers = {new IdentityDateLogger(), new NameSurnameLogger()};
		PlayerManager playerManager = new PlayerManager(loggers);
		Player player1 = new Player(1,"Göksu","Yýlmaz",26,"11122233344","01.09.1993");
		Player player2 = new Player(2,"Hikmet","Yýlmaz",25,"15553337772","01.09.1975");
		playerManager.add(player1);
		System.out.println(" ");
		playerManager.add(player2);
		System.out.println(" ");
		
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign(1, "Kampanya-1", "Pro Evolution Soccer 2013 sadece -19.90-", "01.01.2021", "01.02.2021");
		Campaign campaign2 = new Campaign(2, "Kampanya-2", "GTA V sadece -39.90-", "01.02.2021", "01.03.2021");
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		campaignManager.delete(campaign1);
		System.out.println(" ");
		campaignManager.add(campaign2);
		campaignManager.update(campaign2);
		campaignManager.delete(campaign2);
		System.out.println(" ");
		SalesManager salesManager = new SalesManager();
		salesManager.sale(player1);
		salesManager.discount(campaign1);
		
		
		
		
	}

}
