package concrete;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getStartDate() + " ve " + campaign.getEndDate() + " tarihleri arasında gecerli "
				+ campaign.getName() + " isimli kampanyamızdan faydalandınız." + "Tanımlı Kampanyamız : "
				+ campaign.getDescription());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kamnpanya güncellendi.");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi.");

	}

}
