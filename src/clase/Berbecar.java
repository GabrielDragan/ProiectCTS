package clase;

import interfete.IAtaca;

public class Berbecar implements IAtaca{

	public void ataca(int numarTrupe) {
		if(numarTrupe<200){
			System.out.println("Armata contine berbeci pentru a darama zidul unui sat");
		}
		else if(numarTrupe>200 && numarTrupe<2000)
		{
			System.out.println("Armata contine berbeci pentru a darama zidul satelor natare");
		}
		else
			System.out.println("Armata contine berbeci pentru a darama zidul WW-ului");
		
	}

	

}
