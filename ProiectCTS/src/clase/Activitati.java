package clase;
import interfete.IRezervare;

import java.util.Date;


public class Activitati implements IRezervare{
		private String oras;
		private Date fromDate;
		private Date toDate;
		@Override
		public String tipRezervare() {
			// TODO Auto-generated method stub
			return "activitate";
		}
		public Activitati(String oras, Date fromDate, Date toDate) {
			super();
			this.oras = oras;
			this.fromDate = fromDate;
			this.toDate = toDate;
		}
		public String getOras() {
			return oras;
		}
		public void setOras(String oras) {
			this.oras = oras;
		}
		public Date getFromDate() {
			return fromDate;
		}
		public void setFromDate(Date fromDate) {
			this.fromDate = fromDate;
		}
		public Date getToDate() {
			return toDate;
		}
		public void setToDate(Date toDate) {
			this.toDate = toDate;
		}
		
		
	public Activitati(){
		
	}
	
	
}
