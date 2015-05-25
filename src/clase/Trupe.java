package clase;

public class Trupe {
	
	private int numarCavalerie;
	private int numarInfanterie;
	
	public Trupe(){
		
	}
	
	public Trupe(int cavalerie,int infanterie){
		this.numarCavalerie=cavalerie;
		this.numarInfanterie=infanterie;
	}

	public int getNumarCavalerie() {
		return numarCavalerie;
	}

	public void setNumarCavalerie(int numarCavalerie) {
		if(numarCavalerie > 1000){
		this.numarCavalerie = numarCavalerie;
	}
	else{
		System.out.println("Cavalerie insuficienta pentru aparare!");
	}
}
	public int getNumarInfanterie() {
		return numarInfanterie;
	}

	public void setNumarInfanterie(int numarInfanterie) {
		if(numarInfanterie >2000){
		this.numarInfanterie = numarInfanterie;
		}
		else
		{
			System.out.println("Infanterie insuficienta.Retrage trupe!");
		}
	}
	
	public void cavalerie(){
		if(numarCavalerie > numarInfanterie){
			System.out.println("Cavaleria este mai puternica pentru aparare");
		}
		else if(numarCavalerie <300){
			System.out.println("Retrage cavaleria inainte sa ajunga atacul");
		}
		else 
			System.out.println("Mentine cavaleria in aparare");
	}
	public void infanterie(){
		if(numarInfanterie <2000){
			System.out.println("Retrage trupele altfel le vei pierde");
			
		}
		else
			System.out.println("Pastreaza trupele si mai cere intariri");
	}

	
}
