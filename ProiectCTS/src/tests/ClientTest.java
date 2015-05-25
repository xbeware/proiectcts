package tests;

import static org.junit.Assert.*;
import interfete.IRezervare;
import interfete.ModPlata;

import java.io.File;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Card;
import clase.Client;

public class ClientTest {
Scanner scanner;
Client c;
Client a;
Client x;
Client z;
Client zx;
Client zxx;
Client zzx;
ModPlata pl;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		scanner=new Scanner(new File("Date"));
		a=new Client("raiu", "marius", "19392");
		x=new Client("dada", "Adada", "adadsd");
		z= new Client("ASas", "asas", "13232323");
		zx=new Client("", "", "");
		zxx=new Client(null, null, null);
		zzx=new Client("Assa", "Asasa", "032432432");
		}

	@After
	public void tearDown() throws Exception {
		scanner.close();
	}

	
	
	@Test
	public void checkNume(){
		assertNull(zxx.getNumeClient());
	}
	@Test
	public void checkPrenume(){
		assertNull(zxx.getPrenumeClient());
	}
	
	@Test
	public void checkCNP(){
		assertNull(zxx.getCnpClient());
	}
	@Test
	public void testCalculVarsta() {
		while(scanner.hasNext()){
			String[] tokens=scanner.nextLine().split(" ");
			String nume=tokens[0];
			String prenume= tokens[1];
			String cnp=tokens[2];
			int expecedAge=Integer.parseInt(tokens[3]);
			c=new Client(nume, prenume, cnp);
			assertEquals(expecedAge, c.calculVarsta());
		}
		
	}
	
	@Test
	public void testEmptyValues() {
		assertNotEquals("Marius",zx.getNumeClient());
		
	}
	
	@Test
	public void testCalculVarstaFailed() {
		while(scanner.hasNext()){
			String[] tokens=scanner.nextLine().split(" ");
			String nume=tokens[0];
			String prenume= tokens[1];
			String cnp=tokens[2];
			int expecedAge=Integer.parseInt(tokens[3]);
			c=new Client(nume, prenume, cnp);
			assertNotEquals(10, c.calculVarsta());
			
		}
		
	}
	
	@Test
	public void testCalculVarstaWrongParam() {
		boolean check=x.getCnpClient().matches(".*\\d+.*");
	assertFalse(check);
		
			
		
			
		}
		
	@Test
	public void testCalculVarstaCNPinvalid() {
		
		String zz=String.valueOf(z.getCnpClient().charAt(0));
		boolean x=Integer.parseInt(zz)>6;
		assertFalse(x);
			
		
			
		}
	@Test
	public void checkcnp0(){
		String zz=String.valueOf(zzx.getCnpClient().charAt(0));
		boolean x=Integer.parseInt(zz)<1;
		assertTrue(x);
	}
	
	@Test
	public void checkCNPLength(){
		boolean x=(a.getCnpClient().length()<13 || a.getCnpClient().length()>13);
		
	
		
		
			assertTrue(x);
	
		
			
		
			

	}


	@Test
	public void testVerifEligibil() {
	
	boolean check=	a.verifEligibil();
	assertFalse(check);
		
	}
	
	@Test
	public void modPlata(){
		
		a.setPl(new Card());
		a.plata();
		String string="marius card";
		String aaaa=a.plata();
		System.out.println(aaaa);
		boolean a=string.equalsIgnoreCase(aaaa);
		assertTrue(a);
	}


}
