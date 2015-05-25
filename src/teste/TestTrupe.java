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
	public void testNumarCavalerie(){
		Trupe trupe=new Trupe();
		int cavalerie=trupe.getNumarCavalerie();
		assertEquals(0, cavalerie);
	}
	
	@Test
	public void testInfanterie(){
		try{
			Trupe trupe=new Trupe();
			trupe.setNumarInfanterie(299);
			trupe.infanterie();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	@Test
	public void testFunctieCavalerie(){
		try{
			Trupe trupe=new Trupe();
			trupe.setNumarCavalerie(300);
			trupe.cavalerie();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
