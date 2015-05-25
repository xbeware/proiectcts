package clase;
import interfete.IRezervare;

import java.util.Date;

public class Flight implements IRezervare {

	private String type;
	private String from;
	private String to;
	private Date leave;
	private Date Return;
	private int nrCopii;
	private int nrAdulti;
	private boolean stops;

	public Flight(String type, String from, String to, Date leave,
			Date return1, int nrCopii, int nrAdulti, boolean stops) {
		super();
		this.type = type;
		this.from = from;
		this.to = to;
		this.leave = leave;
		this.Return = return1;
		this.nrCopii = nrCopii;
		this.nrAdulti = nrAdulti;
		this.stops = stops;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Date getLeave() {
		return leave;
	}

	public void setLeave(Date leave) {
		this.leave = leave;
	}

	public Date getReturn() {
		return Return;
	}

	public void setReturn(Date return1) {
		Return = return1;
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

	public boolean isStops() {
		return stops;
	}

	public void setStops(boolean stops) {
		this.stops = stops;
	}

	@Override
	public String tipRezervare() {
		// TODO Auto-generated method stub
		return "flight";
	}

	public Flight(){
		
	}
	
	public int calculeazaSejur(){
		return  Return.getDate()-leave.getDate();
	}
}
