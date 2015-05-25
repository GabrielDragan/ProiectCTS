package clase;

import interfete.IAtaca;

public class TrupeAtac {

	
	private int numarTrupe;
	private IAtaca tipAtac;
	
	public TrupeAtac(int nr){
		this.numarTrupe=nr;
	}
	
	public void ataca(){
		tipAtac.ataca(numarTrupe);
		
	}

	

	public int getNumarTrupe() {
		return numarTrupe;
	}

	public void setNumarTrupe(int numarTrupe) {
		this.numarTrupe = numarTrupe;
	}

	public IAtaca getTipAtac() {
		return tipAtac;
	}

	public void setTipAtac(IAtaca tipAtac) {
		this.tipAtac = tipAtac;
	}
	

}
