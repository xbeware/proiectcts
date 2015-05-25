package clase;
import interfete.IRezervare;
import interfete.ModPlata;

public class Hotel implements IRezervare{
	private String oras;
	private int nrCamere;
	private int nrAdulti;
	private int nrCopii;
	private String nume;
	private int clasificare;

	public Hotel(String oras, int nrCamere, int nrAdulti, int nrCopii,
			String nume, int clasificare) {
		super();
		this.oras = oras;
		this.nrCamere = nrCamere;
		this.nrAdulti = nrAdulti;
		this.nrCopii = nrCopii;
		this.nume = nume;
		this.clasificare = clasificare;
	}

	public String getOras() {
		return oras;
	}

	public void setOras(String oras) {
		this.oras = oras;
	}

	public int getNrCamere() {
		return nrCamere;
	}

	public void setNrCamere(int nrCamere) {
		this.nrCamere = nrCamere;
	}

	public int getNrAdulti() {
		return nrAdulti;
	}

	public void setNrAdulti(int nrAdulti) {
		this.nrAdulti = nrAdulti;
	}

	public int getNrCopii() {
		return nrCopii;
	}

	public void setNrCopii(int nrCopii) {
		this.nrCopii = nrCopii;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getClasificare() {
		return clasificare;
	}

	public void setClasificare(int clasificare) {
		this.clasificare = clasificare;
	}

	@Override
	public String tipRezervare() {
		// TODO Auto-generated method stub
		return "hotel";
	}

	public Hotel(){

	}



}
