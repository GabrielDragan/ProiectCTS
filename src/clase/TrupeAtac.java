package clase;

import interfete.IAtaca;

public class TrupeAtac {

	
	private int numarTrupe;
	private IAtaca tipAtac;
	
	public TrupeAtac(int nr){
		if(numarTrupe !=0){
		this.numarTrupe=nr;
		}
		else
		{
			System.out.println("Nu ai trupe!");
		}
	}
	
	public void ataca(){
		tipAtac.ataca(numarTrupe);
		
	}

	

	public int getNumarTrupe() {
		return numarTrupe;
	}

	public void setNumarTrupe(int numarTrupe) {
		if(numarTrupe !=0){
		this.numarTrupe = numarTrupe;
		}
		else
		{
			System.out.println("Nu exista trupe!");
		}
	}

	public IAtaca getTipAtac() {
		return tipAtac;
	}

	public void setTipAtac(IAtaca tipAtac) {
		
		this.tipAtac = tipAtac;
	}
	

}
