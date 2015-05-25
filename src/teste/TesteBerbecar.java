package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Berbecar;
import clase.Catapultor;

public class TesteBerbecar {

	@Test
	public void test() {
		Berbecar berbec=new Berbecar();
		try
		{
			berbec.ataca(300);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
