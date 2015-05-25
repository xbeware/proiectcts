package main;
import interfete.IRezervare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.attribute.AclEntry.Builder;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

import clase.Activitati;
import clase.Card;
import clase.Client;
import clase.Flight;
import clase.Hotel;
import clase.OptiuneFac;
import clase.Optiuni;
import clase.Rezervare;
import clase.RezervareBuilder;
import clase.Transfer;
import clase.TransferException;



public class main {


	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub

		ArrayList<Rezervare>lista=new ArrayList<Rezervare>();
		//				
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String d="10/04/2015";
		String leave="22/05/2015";
		String returns="30/05/2015";
		Date d1;
		Date d2;
		Date d3;
		Date td;
		String flightTransferTest="9/04/2014";
		d1 = sdf.parse(d);
		d2=sdf.parse(leave);
		d3=sdf.parse(returns);
		Date dTestEx = sdf.parse(flightTransferTest);


		//			
		//				Rezervare r1=new RezervareBuilder("popescu", "razvan").setClasificare(5).setToAct(d1).setLeaveFlight(d2).setReturnFlight(d3).build();
		//				System.out.println(r1.getToAct());
		//				r1.adaugaRezervare(lista,r1);
		//				int a=r1.calculeazaSejur(r1);
		//				System.out.println(a);
		//				System.out.println(lista.get(0).getNumeClient());
		Activitati a=new Activitati("buc", d1, d2);
		Flight f=new Flight("tip","tim","buc",d1,d2,2,2,false);
		Hotel h=new Hotel("buc", 1, 2, 2, "inter", 5);
		Transfer tr=new Transfer(d1, "tim", "buc", h, 7, 4, 30);
		Client cl=new Client("marius", "helo", "21321312");
		IRezervare ir;
		OptiuneFac ofac=OptiuneFac.getInstance();
		ir=ofac.createInstance(Optiuni.Hotel);

		System.out.println(ir.tipRezervare());
		Hotel abc=new Hotel();
		abc.setNrCamere(3);
		Client c=new Client("raiu", "marius", "193");
		c.setPl(new Card());
		c.plata();	


		
		Rezervare re=new RezervareBuilder(0).setActivitate(new Activitati("bucuresti", d1, d2)).setPret(2000).build();
		System.out.println(re.getA().getOras());
		Rezervare r2=new RezervareBuilder(1).setClient(c).setPret(3000).setFlight(f).setTransfer(tr).build();
		r2.adaugaRezervare(lista, re);
		r2.adaugaRezervare(lista, r2);

		for(Rezervare x : lista){
			System.out.println(x.getId());
		}
		r2.cautaRezervare(lista, re);
		r2.stergeRezervare(lista, r2);
		r2.cautaRezervare(lista, r2);
		System.out.println(r2.calculPret());
		try {
			r2.canTransferDate();
		} catch (TransferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String fgh="SDfdsfdsfsd";
		System.out.println(fgh.matches(".*\\d+.*"));
		
	
		

//				 Scanner scanner = new Scanner(new File("Date"));
//		String nume;
//				    while(scanner.hasNext()){
//				        String[] tokens = scanner.nextLine().split(" ");
//				        
//				       
//				         nume = tokens[0];
//				        String prenume=tokens[1];
//				        String cnp=tokens[2];
//				        
//				        
//				    	Client aa=new Client(nume, prenume, cnp);
//				      System.out.println(aa.verifEligibil());
//				      
//				    }

		//Scanner s= new Scanner(System.in);
		//String ss=s.next();

	}}






