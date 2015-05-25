package clase;

public class Trupe {
	
	private int numarCavalerie;
	private int numarInfanterie;
	
	public Trupe(){
		
	}
	
	public Trupe(int cavalerie,int infanterie){
		if(numarCavalerie !=0 && numarInfanterie !=0){
		this.numarCavalerie=cavalerie;
		this.numarInfanterie=infanterie;
		}
		else
		{
			System.out.println("Nu ai trupe!");
		}
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
		 if(numarCavalerie<350){
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
