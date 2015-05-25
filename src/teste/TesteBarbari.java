package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Barbari;
import clase.Daci;
import clase.Trupe;

public class TesteBarbari {

     @Test
	public void testDeplasare() {
		try{
			new Barbari().setDeplasare(90);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	} 
	@Test
	public void testConstructor() {
		try{
			Barbari barbari=new Barbari("teuton",100,29,89,78);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	 @Test
	
	public void testStocareHrana(){
		try{
			new Barbari().setStocareHrana(60);
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
	 
	 @Test
	 public void testNume(){
		 try{
				new Barbari().setNumePersoane("maciucar");
			}catch(Exception e){
				e.printStackTrace();
			}
	 }
	 
	 @Test
	 public void testDezvolta(){
		 try{
				Barbari bar=new Barbari();
				bar.setNumarPersoane(353);
				bar.dezvoltare();
			}catch(Exception e){
				e.printStackTrace();
			}
	 }

}
