package clase;
import java.io.ObjectInputStream.GetField;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class Rezervare {


	int id;
	Activitati a;
	Client c;
	Flight f;
	Hotel h;
	Transfer t;
	int discount;
	int pret;
	boolean payment;

	public Rezervare(int id) {
		this.id=id;
	}

	public Transfer getT(){
		return t;
	}

	public int getId() {
		return id;
	}



	public Activitati getA() {
		return a;
	}



	public Client getC() {
		return c;
	}



	public Flight getF() {
		return f;
	}



	public Hotel getH() {
		return h;
	}



	public boolean isPayment() {
		return payment;
	}



	public int getDiscount() {
		return discount;
	}

	public int getPret() {
		return pret;
	}

	public void adaugaRezervare(ArrayList<Rezervare> lista,Rezervare a){
		lista.add(a);
	}

	public void stergeRezervare(ArrayList<Rezervare> lista,Rezervare a){
		lista.remove(a);
	}
	
	

	public void setDiscount(int discount) {
		this.discount = discount;
	}



	public int cautaRezervare(ArrayList<Rezervare> lista,Rezervare x){
				if(lista.contains(x))
					return x.pret;
				return 0;
				
				
	}
	
	public int calculPret(){
		if(c.verifEligibil())
			setDiscount(1000);
			return pret=pret-discount;
			
			
	}
	
	public void canTransferDate() throws TransferException{
		if(t.getData().compareTo(f.getLeave())<0)
			throw new EarlyFlightException();
		else if(t.getData().compareTo(f.getLeave())>0)
			throw new LateFlightException();
		else if(t.getData().compareTo(f.getLeave())==0)
			System.out.println("can transfer");
		
			
		
	}
	
	
	

	
	
	
	
}

