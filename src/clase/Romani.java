package clase;

import interfete.ITrib;

public class Romani implements ITrib{
	
	
	
	private String numePersoane;
	private int numarPersoane;
	private int deplasare;
	private int stocareHrana;
	private int fortaArmata;
	
	public Romani(){
		this.numePersoane="roman";
		this.numarPersoane=382;
		this.deplasare=25;
		this.stocareHrana=306845;
		this.fortaArmata=3867;
	}
	
	public Romani(String nume,int numar,int deplasare,int stocare,int forta){
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
		if(stocareHrana > fortaArmata*4){
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
		return "Romani [numePersoane=" + numePersoane + ", numarPersoane="
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
