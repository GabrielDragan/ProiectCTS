package clase;

public class TrupeGeneral {
	
	private String tip;
	
	public TrupeGeneral(){
		this.tip="infanterie";
	}
	
	public TrupeGeneral(String tip){
		this.tip=tip;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		if(tip !="infanterie" && tip !="cavalerie"){
		this.tip = tip;
		}
		else
		{
			System.out.println("Tipul trupelor nu exista!");
		}
	}
	
	public void afisareSatAtacat(SatAtacat atacat){
		System.out.println("Trupele de tip "+tip+" ataca la pozitia ("+atacat.getPozitieX()+", "+atacat.getPozitieY()+")");
	}
	
	

}
