package fr.ub.isped.sitis.lecaplain;


public class Acte {

	//Attributs
	private String id_akt;
	private String id_ccam;
	private String date_atk;
	private String id_hospitalisation;
	private int anesth;

	//Constructeur
	public Acte(String id_akt, String id_ccam, String date_atk, String id_hospitalisation, int anesth) {
		super();
		this.id_akt = id_akt;
		this.id_ccam = id_ccam;
		this.date_atk = date_atk;
		this.id_hospitalisation = id_hospitalisation;
		this.anesth = anesth;
	}

	//Getters, setters
	public String getId_akt() {
		return id_akt;
	}

	public void setId_akt(String id_akt) {
		this.id_akt = id_akt;
	}

	public String getId_ccam() {
		return id_ccam;
	}

	public void setId_ccam(String id_ccam) {
		this.id_ccam = id_ccam;
	}

	public String getDate_atk() {
		return date_atk;
	}

	public void setDate_atk(String date_atk) {
		this.date_atk = date_atk;
	}

	public String getId_hospitalisation() {
		return id_hospitalisation;
	}

	public void setId_hospitalisation(String id_hospitalisation) {
		this.id_hospitalisation = id_hospitalisation;
	}

	public int getAnesth() {
		return anesth;
	}

	public void setAnesth(int anesth) {
		this.anesth = anesth;
	}

	@Override
	public String toString() {
		return "Id acte: " + id_akt + "\nHospitalisation : " + id_hospitalisation + "\nId CCAM : " + id_ccam + "\nDate acte : "+ date_atk + "\nAnesthésie : " + anesth + "\n- - -";
	}


}
