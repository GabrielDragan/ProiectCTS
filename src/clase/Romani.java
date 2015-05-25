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
	
	public Romani(String numePersoane,int numarPersoane,int deplasare,int stocareHrana,int fortaArmata){
		if (numePersoane != null && !numePersoane.matches("[0-9]+")){
			this.numePersoane=numePersoane;
			}
			if(numarPersoane !=0){
			this.numarPersoane=numarPersoane;
			}
			if(deplasare !=0){
			this.deplasare=deplasare;
			}
			if(stocareHrana !=0){
			this.stocareHrana=stocareHrana;}
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
	public int consumHrana(Trupe tr){
		int consum=0;
		return consum=tr.getNumarCavalerie()*stocareHrana+tr.getNumarInfanterie()*stocareHrana;
	}

}
