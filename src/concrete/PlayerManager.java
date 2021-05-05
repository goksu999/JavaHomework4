package concrete;

import abstracts.Logger;

import entities.Player;



public class PlayerManager{
	
	private Logger[] loggers;
	public PlayerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	
	public void add(Player player) {
		System.out.println(player.getFirstName() + " adl� ki�i sisteme eklendi.");
		homework3.Utils.runLoggers(loggers, player.getFirstName());

		
	}
	
	public void update(Player player) {
		System.out.println(player.getFirstName() + " adl� ki�inin bilgileri g�ncellendi.");
		homework3.Utils.runLoggers(loggers, player.getFirstName());
		
	}
	
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " adl� ki�i sistemden silindi.");
		homework3.Utils.runLoggers(loggers, player.getFirstName());
		
	}
	
	
	
}



	






