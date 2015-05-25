package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Trupe;

public class TestTrupe {

	
	@Test
	public void testNumarInfanterie(){
		try{
			new Trupe().setNumarInfanterie(5005);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	public void testCavalerie(){
		Trupe trupe=new Trupe();
		int cavalerie=trupe.getNumarCavalerie();
		assertEquals(0, cavalerie);
	}
}
