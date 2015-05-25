package clase;
import interfete.IRezervare;

import java.sql.Timestamp;
import java.util.Date;

public class Transfer implements IRezervare {

	private Date data;
	
	private String orasPickup;
	private String orasDropoff;
	private Hotel destinatie;
	private int nrCopii;
	private int nrAdulti;
	private int luggage;
	
	
	

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	

	

	public String getOrasPickup() {
		return orasPickup;
	}

	public void setOrasPickup(String orasPickup) {
		this.orasPickup = orasPickup;
	}

	public String getOrasDropoff() {
		return orasDropoff;
	}

	public void setOrasDropoff(String orasDropoff) {
		this.orasDropoff = orasDropoff;
	}

	public Hotel getDestinatie() {
		return destinatie;
	}

	public void setDestinatie(Hotel destinatie) {
		this.destinatie = destinatie;
	}

	public int getNrCopii() {
		return nrCopii;
	}

	public void setNrCopii(int nrCopii) {
		this.nrCopii = nrCopii;
	}

	public int getNrAdulti() {
		return nrAdulti;
	}

	public void setNrAdulti(int nrAdulti) {
		this.nrAdulti = nrAdulti;
	}

	public int getLuggage() {
		return luggage;
	}

	public void setLuggage(int luggage) {
		this.luggage = luggage;
	}

	public Transfer(Date data,  String orasPickup,
			String orasDropoff, Hotel destinatie, int nrCopii, int nrAdulti,
			int luggage) {
		super();
		this.data = data;
		
		this.orasPickup = orasPickup;
		this.orasDropoff = orasDropoff;
		this.destinatie = destinatie;
		this.nrCopii = nrCopii;
		this.nrAdulti = nrAdulti;
		this.luggage = luggage;
		
	}

	@Override
	public String tipRezervare() {
		// TODO Auto-generated method stub
		return "transfer";
	}
	
	
	public Transfer(){
		
	}
}
