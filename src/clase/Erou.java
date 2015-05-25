package clase;

public class Erou {
	
	

	private String nume;
	private int viteza;
	private int gradDezvoltare;
	
	private static Erou singleton=null;
	
	public Erou(){
		this.nume="MadMan";
		this.viteza=33;
		this.gradDezvoltare=70;
		
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		if(nume !="dac" && nume !="barbar" && nume!="roman")
		{
		this.nume = nume;
		}
		else
		{
			System.out.println("Nume gresit,introduce unul corect!");
		}
	}

	public int getViteza() {
		return viteza;
	}

	public void setViteza(int viteza) {
		this.viteza = viteza;
	}

	public int getGradDezvoltare() {
		return gradDezvoltare;
	}

	public void setGradDezvoltare(int gradDezvoltare) {
		this.gradDezvoltare = gradDezvoltare;
	}
	@Override
	public String toString() {
		return "Erou [nume=" + nume + ", viteza=" + viteza
				+ ", gradDezvoltare=" + gradDezvoltare + "]";
	}
	
	public static Erou getInstance(){
		if(singleton==null){
			singleton=new Erou();
		}
		return singleton;
	}
	
	
	

}
