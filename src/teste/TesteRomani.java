package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Barbari;
import clase.Romani;

public class TesteRomani {

	@Test
	public void testNume() {
		try{
			new Romani().setNumePersoane("legionar");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFortaArmata(){
		try{
			new Romani().setFortaArmata(6000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConstructor(){
		try{
		Romani romani=new Romani("praetorian", 300, 17, 80, 73);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDezvolta(){
		try{
			Romani romani=new Romani();
			romani.setNumarPersoane(693);
			romani.dezvoltare();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
