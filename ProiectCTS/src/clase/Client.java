package clase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

import interfete.ModPlata;

public class Client {

	
	 String numeClient;
	 String prenumeClient;
	 String cnpClient;
	 ModPlata pl;
	 
	 
	 
	public  Client(String numeClient, String prenumeClient, String cnpClient) {
		super();
		this.numeClient = numeClient;
		this.prenumeClient = prenumeClient;
		this.cnpClient = cnpClient;
		
		
	}
	public String getNumeClient() {
		return numeClient;
	}
	public void setNumeClient(String numeClient) {
		this.numeClient = numeClient;
	}
	public String getPrenumeClient() {
		return prenumeClient;
	}
	public void setPrenumeClient(String prenumeClient) {
		this.prenumeClient = prenumeClient;
	}
	public String getCnpClient() {
		return cnpClient;
	}
	public void setCnpClient(String cnpClient) {
		this.cnpClient = cnpClient;
	}
	 
	
	public int calculVarsta(){
		
		return Calendar.getInstance().get(Calendar.YEAR) - (1900 + Integer.parseInt("" + cnpClient.charAt(1) + cnpClient.charAt(2)));
	}
	
	public boolean verifEligibil()
	{
		if(calculVarsta()>60)
			return true;
		return false;
	}
	public ModPlata getPl() {
		return pl; 
	}
	public void setPl(ModPlata pl) {
		this.pl = pl;
	}
	public String plata(){
		return pl.plata(prenumeClient);
	}
	
	
	

	
}
