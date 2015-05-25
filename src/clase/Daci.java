package clase;

import interfete.ITrib;

public class Daci implements ITrib{
	
	


	private String numePersoane;
	private int numarPersoane;
	private int deplasare;
	private int stocareHrana;
	private int fortaArmata;
	
	
	public Daci(){
		this.numePersoane="dac";
		this.numarPersoane=260;
		this.deplasare=24;
		this.stocareHrana=300009;
		this.fortaArmata=9123;
	}
	public Daci(String nume,int numar,int deplasare,int stocare,int fortaArmata)
	{
		this.numePersoane=nume;
		this.numarPersoane=numar;
		this.deplasare=deplasare;
		this.stocareHrana=stocare;
		this.fortaArmata=fortaArmata;
	}
	
	
	public int getNumarPersoane() {
		return numarPersoane;
	}


	public void setNumarPersoane(int numarPersoane) {
		this.numarPersoane = numarPersoane;
	}


	public String getNumePersoane() {
		return numePersoane;
	}


	public void setNumePersoane(String numePersoane) {
		this.numePersoane = numePersoane;
	}


	public int getDeplasare() {
		return deplasare;
	}


	public void setDeplasare(int deplasare) {
		this.deplasare = deplasare;
	}


	public int getStocareHrana() {
		return stocareHrana;
	}


	public void setStocareHrana(int stocareHrana) {
		if(stocareHrana > fortaArmata*3){
		this.stocareHrana = stocareHrana;
		}
		else
		{
			System.out.println("Hrana insuficienta");
		}
	}


	public int getFortaArmata() {
		return fortaArmata;
	}


	public void setFortaArmata(int fortaArmata) {
		this.fortaArmata = fortaArmata;
	}
	
	@Override
	public String toString() {
		return "Daci [numePersoane=" + numePersoane + ", numarPersoane="
				+ numarPersoane + ", deplasare=" + deplasare
				+ ", stocareHrana=" + stocareHrana + ", fortaArmata="
				+ fortaArmata + "]";
	}


	public void dezvoltare() {
		if(numarPersoane < 100){
			fortaArmata=numarPersoane/3;
			System.out.println(fortaArmata);
		}
		else if(numarPersoane> 100 && numarPersoane<500){
			fortaArmata=numarPersoane*2;
			System.out.println(fortaArmata);
		}
		else{ 
			fortaArmata=numarPersoane*3;
			System.out.println(fortaArmata);
		}
	}

}
