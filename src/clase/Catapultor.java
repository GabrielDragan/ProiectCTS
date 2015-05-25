package clase;

import interfete.IAtaca;

public class Catapultor implements IAtaca{
	
	public Catapultor(){
		
	}

	public void ataca(int numarTrupe) {
		if(numarTrupe<=0)
		{
			System.out.println("Armata nu este nula niciodata");
		}
		else if(numarTrupe<500){
			System.out.println("Armata contine catapulte pentru a darama infrastructura unui sat");
		}
		else if(numarTrupe>500 && numarTrupe<4000)
		{
			System.out.println("Armata contine catapulte pentru a darama trezoreria satelor natare");
		}
		else
			System.out.println("Armata contine catapulte pentru a duce WW-ul la nivelul 0");
	}

}
