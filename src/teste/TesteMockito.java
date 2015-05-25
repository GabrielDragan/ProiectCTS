package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnit44Runner;

import clase.Barbari;
import clase.Romani;
import clase.SatAtacat;
import clase.Trupe;

@RunWith(MockitoJUnit44Runner.class)

public class TesteMockito {
	
	@Mock
	Trupe trupe;
	
	@Mock
	Barbari barbari;
	
	@Mock
	Barbari bar;
	
	@Test
	public void TestTrupe(){
		Romani romani=new Romani();
		Mockito.when(bar.getFortaArmata()).thenReturn(2354);
		
		
		romani.setNumePersoane("legionar");
		romani.setNumarPersoane(234);
		romani.setDeplasare(89);
		romani.setStocareHrana(78);
		romani.setFortaArmata(bar.getFortaArmata());
		System.out.println("Test "+ romani.toString());
		
	}
	
	@Test
	public void testConsumHrana(){
		Trupe trupe=new Trupe();
		
	}

	

}
