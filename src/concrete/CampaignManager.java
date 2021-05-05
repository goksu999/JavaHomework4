package concrete;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getStartDate() + " ve " + campaign.getEndDate() + " tarihleri aras�nda gecerli "
				+ campaign.getName() + " isimli kampanyam�zdan faydaland�n�z." + "Tan�ml� Kampanyam�z : "
				+ campaign.getDescription());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kamnpanya g�ncellendi.");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi.");

	}

}
