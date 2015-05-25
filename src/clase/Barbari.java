package clase;

import java.awt.font.NumericShaper;

import interfete.ITrib;

public class Barbari implements ITrib{
	
	

	private String numePersoane;
	private int numarPersoane;
	private int deplasare;
	private int stocareHrana;
	private int fortaArmata;
	
	public Barbari(){
		
		/*this.numePersoane="barbar";
		this.numarPersoane=360;
		this.deplasare=20;
		this.stocareHrana=300045;
		this.fortaArmata=9867; */
		
	}
	
	public Barbari(String numeP,int numarPersoane,int deplasare,int stocare,int fortaArmata){
		if (numePersoane != null && !numePersoane.matches("[0-9]+")) {
		this.numePersoane=numeP;
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
