package clase;

import interfete.IAparare;

public class TrupeAparare implements IAparare{
	
	private Trupe aparare;
	
	public TrupeAparare(Trupe trupe){
		if(aparare.getNumarCavalerie() !=0 && aparare.getNumarInfanterie() !=0){
		this.aparare=trupe;
		}
		else
		{
			System.out.println("Nu ai cu ce te apara!");
		}
	}

	public void aparareCavalerie() {
		aparare.cavalerie();
		
	}

	public void aparareInfanterie() {
		aparare.infanterie();
		
	}

}
