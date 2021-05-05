package concrete;

import abstracts.Logger;

import entities.Player;



public class PlayerManager{
	
	private Logger[] loggers;
	public PlayerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	
	public void add(Player player) {
		System.out.println(player.getFirstName() + " adlý kiþi sisteme eklendi.");
		homework3.Utils.runLoggers(loggers, player.getFirstName());

		
	}
	
	public void update(Player player) {
		System.out.println(player.getFirstName() + " adlý kiþinin bilgileri güncellendi.");
		homework3.Utils.runLoggers(loggers, player.getFirstName());
		
	}
	
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " adlý kiþi sistemden silindi.");
		homework3.Utils.runLoggers(loggers, player.getFirstName());
		
	}
	
	
	
}



	






