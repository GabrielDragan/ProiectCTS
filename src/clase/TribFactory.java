package clase;

import interfete.ITrib;

public class TribFactory {
	
	public ITrib createInstance(Trib numeTrib){
		switch(numeTrib){
		case Barbari: return new Barbari();
		case Daci:return new Daci();
		case Romani: return new Romani();
		
		}
		return null;
	}
	

}
