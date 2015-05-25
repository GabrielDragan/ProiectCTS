package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.TrupeGeneral;

public class TestTrupeGeneral {

	@Test
	public void testConstrutorParametrii() {
	try{
		TrupeGeneral trupe=new TrupeGeneral("executori");
	}
	catch(Exception ex){
		ex.printStackTrace();
	}
	}

}
