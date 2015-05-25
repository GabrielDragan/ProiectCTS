package main;

import interfete.IAparare;
import interfete.ITrib;
import clase.Berbecar;
import clase.Catapultor;
import clase.Erou;
import clase.SatAtacat;
import clase.Trib;
import clase.TribFactory;
import clase.Trupe;
import clase.TrupeAparare;
import clase.TrupeAtac;
import clase.TrupeFlyweight;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*	ITrib trib;
		
		TribFactory tribfact=new TribFactory();
		trib=tribfact.createInstance(Trib.Romani);
		System.out.println(trib.toString());
		
		trib=tribfact.createInstance(Trib.Barbari);
		System.out.println(trib.toString());
		*/
		
		/*TrupeAtac trupe=new TrupeAtac(2500);
		trupe.setTipAtac(new Catapultor());
		trupe.ataca();
		trupe.setTipAtac(new Berbecar());
		trupe.ataca(); */
		
	/*	Trupe tr=new Trupe(2900,4000);
		IAparare aparare=new TrupeAparare(tr);
		aparare.aparareCavalerie();
		aparare.aparareInfanterie();
		*/
		
		TrupeFlyweight trupe=new TrupeFlyweight();
		SatAtacat sat=new SatAtacat(30, 79);
		trupe.getAtac("cavalerie").afisareSatAtacat(sat);
		trupe.getAtac("infanterie").afisareSatAtacat(sat);
		System.out.println("Numarul de trupe:"+trupe.getSize());

	}

}
