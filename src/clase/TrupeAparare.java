package clase;

import interfete.IAparare;

public class TrupeAparare implements IAparare{
	
	private Trupe aparare;
	
	public TrupeAparare(Trupe trupe){
		this.aparare=trupe;
	}

	public void aparareCavalerie() {
		aparare.cavalerie();
		
	}

	public void aparareInfanterie() {
		aparare.infanterie();
		
	}

}
