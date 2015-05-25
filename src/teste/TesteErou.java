package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Erou;

public class TesteErou {

	@Test
	public void test(){
		try{
			Erou erou = Erou.getInstance();
			erou.setNume("Nemesis"); erou.setViteza(94); 
			Erou erou1 = Erou.getInstance();
			erou.setNume("KillThem"); erou.setViteza(99);
			assertEquals(erou, erou1);
			}catch(Exception ex){
				ex.printStackTrace();
			}
	}
	
	@Test
	public void testViteza(){
		try{
			Erou.getInstance().setViteza(101);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void testNume(){
		try{
			Erou.getInstance().setNume("Scourge");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	

}
