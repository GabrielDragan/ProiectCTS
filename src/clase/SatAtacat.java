package clase;

public class SatAtacat {
	
	private int pozitieX;
	private int pozitieY;
	
	public SatAtacat(){
		this.pozitieX=20;
		this.pozitieY=20;
	}
	
	public SatAtacat(int x,int y){
		if(pozitieX !=0 && pozitieY !=0){
		this.pozitieX=x;
		this.pozitieY=y;
		}
		else
		{
			System.out.println("Introduce alte date!");
		}
	}

	public int getPozitieX() {
		return pozitieX;
	}

	public void setPozitieX(int pozitieX) {
		if(pozitieX !=0){
		this.pozitieX = pozitieX;
		}
		else
		{
			System.out.println("Introdu o pozitie corecta!");
		}
	}

	public int getPozitieY() {
		return pozitieY;
	}

	public void setPozitieY(int pozitieY) {
		if(pozitieY !=0){
		this.pozitieY = pozitieY;
		}
		else
		{
			System.out.println("Introdu o pozitie corecta!");
		}
	}
	

}
