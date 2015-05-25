package clase;

import interfete.ITrib;

public class Barbari implements ITrib{
	
	

	private String numePersoane;
	private int numarPersoane;
	private int deplasare;
	private int stocareHrana;
	private int fortaArmata;
	
	public Barbari(){
		
		this.numePersoane="barbar";
		this.numarPersoane=360;
		this.deplasare=20;
		this.stocareHrana=300045;
		this.fortaArmata=9867;
		
	}
	
	public Barbari(String nume,int numar,int deplasare,int stocare,int forta){
		this.numePersoane=nume;
		this.numarPersoane=numar;
		this.deplasare=deplasare;
		this.stocareHrana=stocare;
		this.fortaArmata=forta;
	}
	

	public int getNumarPersoane() {
		return numarPersoane;
	}


	public void setNumarPersoane(int numarPersoane) {
		this.numarPersoane = numarPersoane;
	}


	public int getFortaArmata() {
		return fortaArmata;
	}


	public void setFortaArmata(int fortaArmata) {
		this.fortaArmata = fortaArmata;
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
		if(stocareHrana > fortaArmata*2){
			this.stocareHrana = stocareHrana;
			}
			else
			{
				System.out.println("Hrana insuficienta");
			}
	}
	@Override
	public String toString() {
		return "Barbari [numePersoane=" + numePersoane + ", numarPersoane="
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