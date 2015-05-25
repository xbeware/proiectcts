package clase;
import java.sql.Timestamp;
import java.util.Date;

	
public class RezervareBuilder {
	private Rezervare r=null;
	
	public RezervareBuilder(int id){
		this.r=new Rezervare(id);
	}
	
	
	public RezervareBuilder setActivitate(Activitati a){
		this.r.a=a;
		return this;
	}
	
	
	public RezervareBuilder setClient(Client c){
		this.r.c=c;
		return this;
	}
	
	
	public RezervareBuilder setFlight(Flight f){
		this.r.f=f;
		return this;
	}
	
	public RezervareBuilder setTransfer(Transfer t){
		this.r.t=t;
		return this;
	}
	
	public RezervareBuilder setHotel(Hotel h){
		this.r.h=h;
		return this;
	}
	
	
	public RezervareBuilder setPret(int pret){
		this.r.pret=pret;
		return this;
	}
	
	
	public Rezervare build(){
		return this.r;
	}
	

	
	
	

}
