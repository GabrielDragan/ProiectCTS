package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Trupe;

public class TesteFisier {
	public static File file;
	public static BufferedReader reader;
	
	@Before
	public void setUp() throws Exception {
		//reader=new FileReader("Trupe");
	//	System.out.println("cacat");
		file = new File("Trupe.txt");
		reader =new BufferedReader(new FileReader(file));
		System.out.println("ssaf");
	}

	@After
	public void tearDown() throws Exception {
		
		//System.out.println("Inchis");
		reader.close();
	}

	@Test
	public void testFisier() {
		System.out.println("E deschis");
		try {
			Trupe trupe=new Trupe();
			trupe.setNumarCavalerie(48738);
			
			String linie=null;
			while((linie=reader.readLine())!=null){
				String [] valori=linie.split(" ");
				int rezultat=Integer.parseInt(valori[0]);
				//int number=Integer.parseInt(linie.split(" ")[1]);
				System.out.println("Numar cavalerie:"+rezultat);
				System.out.println(trupe.getNumarCavalerie());
				assertEquals(rezultat, trupe.getNumarCavalerie());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
