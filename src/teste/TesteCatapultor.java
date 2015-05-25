package teste;

import static org.junit.Assert.*;
import interfete.IAtaca;

import org.junit.Test;

import clase.Catapultor;

public class TesteCatapultor {

	@Test
	public void test() {
		Catapultor catapulta=new Catapultor();
		try
		{
			catapulta.ataca(300);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
