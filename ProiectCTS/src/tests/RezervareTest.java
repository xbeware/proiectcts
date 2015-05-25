package tests;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.*;

import clase.Activitati;
import clase.Client;
import clase.Flight;
import clase.Hotel;
import clase.Rezervare;
import clase.RezervareBuilder;
import clase.Transfer;
import clase.TransferException;

public class RezervareTest {
	Rezervare r2;
	ArrayList<Rezervare> lista;
	Client clx;
	Rezervare r3;
	ArrayList<Rezervare> mockList;
	Rezervare rzv;
	Client cc;
	Rezervare rmock;
	Rezervare rx;
	Rezervare rez;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		lista = new ArrayList<Rezervare>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String d = "10/04/2015";
		String leave = "22/05/2015";
		String returns = "30/05/2015";
		Date d1;
		Date d2;
		Date d3;
		Date td;
		String flightTransferTest = "9/04/2014";
		d1 = sdf.parse(d);
		d2 = sdf.parse(leave);
		d3 = sdf.parse(returns);
		Date dTestEx = sdf.parse(flightTransferTest);
		Activitati a = new Activitati("buc", d1, d2);
		Flight f = new Flight("tip", "tim", "buc", d1, d2, 2, 2, false);
		Hotel h = new Hotel("buc", 1, 2, 2, "inter", 5);
		Transfer tr = new Transfer(d2, "tim", "buc", h, 7, 4, 30);
		Client cl = new Client("marius", "helo", "21321312");
		
		r2 = new RezervareBuilder(1).setClient(cl).setPret(3000).setFlight(f)
				.setTransfer(tr).build();
		clx = Mockito.mock(Client.class);
		Mockito.when(clx.verifEligibil()).thenReturn(false);
		r3 = new RezervareBuilder(1).setClient(clx).setPret(3000).setFlight(f)
				.setTransfer(tr).build();
		rzv=new RezervareBuilder(3).build();
		 rmock=Mockito.mock(Rezervare.class);
		rx=new RezervareBuilder(2).setPret(-2000).build();
		Mockito.when(rmock.getPret()).thenReturn(0);
		rez= new RezervareBuilder(4).setClient(null).build();

	}

	@After
	public void tearDown() throws Exception {
		
	}
	public void checkClient(){
		assertNull(rez.getC());
	}
	
	@Test
	public void getMock(){
		assertNotEquals(-1, rmock.getPret());
	}
	
	@Test
	public void pret(){
		boolean c=rx.getPret()<0;
		assertTrue(c);
	}
	
	
	@Test
	public void testCalculPretMock() {

		int z = r3.calculPret();
		assertNotEquals(2000, z);

	}

	@Test
	public void testAdaugaRezervare() {
		int s = lista.size();
		r2.adaugaRezervare(lista, r2);
		boolean b = lista.size() > s;
		assertTrue(b);

	}

	@Test
	public void testStergeRezervare() {

		r2.adaugaRezervare(lista, r2);
		int s = lista.size();
		r2.stergeRezervare(lista, r2);
		boolean b = lista.size() < s;
		assertTrue(b);

	}

	@Test
	public void testCautaRezervare() {
		r2.adaugaRezervare(lista, r2);
		int x = r2.cautaRezervare(lista, r2);

		assertEquals(lista.get(0).getPret(), x);
	}

	
	@Test
	public void testCautaRezervare1() {

		assertTrue(lista.isEmpty());
		lista.add(r2);
		assertFalse("asas", lista.isEmpty());
	}

	@Test
	public void testCalculPret() {
		int x = r2.getPret();
		int z = r2.calculPret();
		assertEquals(2000, z);

	}

	@Test
	public void testCanTransferDate() {
		try {
			r2.canTransferDate();
			assertFalse("metoda nu arunca exceptie pe x", true);
			;

		} catch (TransferException ex) {
			assertTrue("Metoda arunca exceptie pe d2", true);
		}
	}

}
