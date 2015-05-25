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
		if (numePersoane != null && !numePersoane.matches("[0-9]+")){
			this.numePersoane=nume;
			}
			if(numarPersoane !=0){
			this.numarPersoane=numarPersoane;
			}
			if(deplasare !=0){
			this.deplasare=deplasare;
			}
			if(stocareHrana !=0){
			this.stocareHrana=stocare;}
			if(fortaArmata !=0){
			this.fortaArmata=fortaArmata;
			}
			
			else
			{
				System.out.println("Date incorecte");
			}
	}
	
	
	public int getNumarPersoane() {
		return numarPersoane;
	}


	public void setNumarPersoane(int numarPersoane) {
		if(numarPersoane !=0){
			this.numarPersoane = numarPersoane;
			}
			else
			{
				System.out.println("Introdu alt numar!");
			}
	}


	public String getNumePersoane() {
		return numePersoane;
	}


	public void setNumePersoane(String numePersoane) {

		if (numePersoane != null && !numePersoane.matches("[0-9]+")){
			this.numePersoane = numePersoane;
			}
			else
			{
				System.out.println("Introdu numele corect!");
			}
	}


	public int getDeplasare() {
		return deplasare;
	}


	public void setDeplasare(int deplasare) {
		if(deplasare !=0){
			this.deplasare = deplasare;
			}
			else
			{
				System.out.println("Introdu alte date pentru deplasare!");
			}
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
		if(fortaArmata !=0){
			this.fortaArmata = fortaArmata;
			}
			else
			{
				System.out.println("Introdu alt numar de soldati!");
			}
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
