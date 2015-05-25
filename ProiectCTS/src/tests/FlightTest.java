package tests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Flight;

public class FlightTest {
	Flight f;
	Date d1;
	Date d2;
	Date d3;
	Date td;
	String leave;
	SimpleDateFormat sdf;
	String wrong;
	Flight fx;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		sdf=new SimpleDateFormat("dd/MM/yyyy");
		String d="10/04/2015";
		 leave="22/05/2015";
		String returns="30/05/2015";
		wrong="03-04-2015";
		
		String flightTransferTest="9/04/2014";
		d1 = sdf.parse(d);
		d2=sdf.parse(leave);
		d3=sdf.parse(returns);
		Date dTestEx = sdf.parse(flightTransferTest);
		f=new Flight("a", "tim", "buc", d2, d3, 2, 3, false);
		fx=new Flight("a", "tim", "buc", d3, d2, 2, 3, false);
		
	}

	@After
	public void tearDwn() throws Exception {
	}

	@Test
	public void testCalculeazaSejur() {
	
		int x=f.calculeazaSejur();
		assertEquals(8, x);
	}
	
	
	
	
	@Test
	public void calculeazaSejur1(){
		int x=f.calculeazaSejur();
		boolean xx=x<0;
		assertFalse(xx);
	}
	
	@Test
	public void calculeazaSejur2(){
		try {
			 Date c =sdf.parse(wrong);
			 Flight fd=new Flight("Sdfds", "SDfds", "fsdfsd", c, d1, 2, 3, false);
			 fd.calculeazaSejur();
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			assertFalse(false);
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void validareFormat(){
		String zz=String.valueOf(leave.charAt(2));
		String zzz=String.valueOf(leave.charAt(5));
		String xx=zz+zzz;
		
		boolean x= !xx.contains("/");
	
		assertFalse(x);
		
		
	}
	
	@Test
	public void testAtributes(){
		boolean x=f.getFrom().equals("") ||f.getTo().equals("");
		assertFalse(x);
		
	}
	
	@Test
	public void testAtributes1(){
		boolean x=f.getNrAdulti()<0 || f.getNrAdulti()<0;
		assertFalse(x);
		
	}

}
