package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Daci;
import clase.Trupe;

public class TesteDaci {

	@Test
	public void testConstructor() {
		try{
			Daci dac=new Daci("paladini", 400, 80, 50, 98);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void testNume(){
	         
		try{
				new Daci().setNumePersoane("paladin");
			}catch(Exception e){
				e.printStackTrace();
			}
		
	}

}
