package clase;
import interfete.IRezervare;


public class OptiuneFac {
	
	private static OptiuneFac instance;
	
	
	private OptiuneFac(){
		super();
	}
	
	public static OptiuneFac getInstance(){
		if(instance==null)
			instance=new OptiuneFac();
		return instance;
	}
	
	public IRezervare createInstance(Optiuni o){
		
		switch (o) {
		case Activitati: return new Activitati();
		case Flight: return new Flight();
		case Hotel:return new Hotel();
		case Transfer:return new Transfer();
		
			

		}
		return null;
	}
}
