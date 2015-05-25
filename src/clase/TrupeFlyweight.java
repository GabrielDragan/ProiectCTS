package clase;

import java.util.HashMap;

import interfete.IAtacaSat;

public class TrupeFlyweight implements IAtacaSat {
	
     private HashMap<String,TrupeGeneral> troups=new HashMap<String,TrupeGeneral>();

    public TrupeGeneral getAtac(String tip) {
	TrupeGeneral trupe=troups.get(tip);
	if(trupe==null){
		trupe=new TrupeGeneral(tip);
		troups.put(tip, trupe);
	}
	return trupe;
}
    
    public int getSize(){
    	return troups.size();
    }
	
	

	

	

}
