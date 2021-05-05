package entities;

public class Sales {
	private int id;
	private Player player;
	private String date;
	private Campaign campaign;
	
	
	public Sales(int id, Player player, String date, Campaign campaign) {
		super();
		this.id = id;
		this.player = player;
		this.date = date;
		this.campaign = campaign;
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Campaign getCampaign() {
		return campaign;
	}


	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
}
