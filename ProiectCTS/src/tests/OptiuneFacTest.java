package tests;

import static org.junit.Assert.*;
import interfete.IRezervare;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Activitati;
import clase.Hotel;
import clase.OptiuneFac;
import clase.Optiuni;

public class OptiuneFacTest {

	 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetInstance() {
		
		OptiuneFac fac=OptiuneFac.getInstance();
		OptiuneFac a=OptiuneFac.getInstance();
		
		assertSame(fac, a);
	}
	
	
	@Test
	public void test1(){
		OptiuneFac x=OptiuneFac.getInstance();
		assertNotNull(x);
	}
	
	@Test
	public void test2(){
		OptiuneFac fac=OptiuneFac.getInstance();
		IRezervare ir=fac.createInstance(Optiuni.Hotel);
		Hotel ho=new Hotel();
		
		assertEquals(ir.getClass(), ho.getClass());
	
	}
	@Test
	public void test3(){
		OptiuneFac fac=OptiuneFac.getInstance();
		IRezervare ir=fac.createInstance(Optiuni.Avion);
		assertNull(ir);
	}
	
	
	
	
	@Test
	public void testCreateInstance() throws ParseException {
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String d="10/04/2015";
		String leave="22/05/2015";
		String returns="30/05/2015";
		Date d1;
		Date d2;
		Date d3;
			d1 = sdf.parse(d);
			d2=sdf.parse(leave);
			d3=sdf.parse(returns);
		Activitati a=new Activitati("buc", d1, d2);
		Hotel h=new  Hotel("buc",2,3,2,"asas",5);
		assertEquals(a.getOras(),h.getOras());
		
		
	}
	

	
	

}
