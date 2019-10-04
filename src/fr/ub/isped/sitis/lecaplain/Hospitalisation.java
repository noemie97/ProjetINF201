package fr.ub.isped.sitis.lecaplain;

public class Hospitalisation {

	//Attributs
	private String id_hospitalisation;
	private String id_patient;
	private String date_entree;
	private String date_sortie;

	//Constructeur
	public Hospitalisation(String id_hospitalisation, String id_patient, String date_entree, String date_sortie) {
		super();
		this.id_hospitalisation = id_hospitalisation;
		this.id_patient = id_patient;
		this.date_entree = date_entree;
		this.date_sortie = date_sortie;
	}

	//getters, setters
	public String getId_hospitalisation() {
		return id_hospitalisation;
	}

	public void setId_hospitalisation(String id_hospitalisation) {
		this.id_hospitalisation = id_hospitalisation;
	}

	public String getId_patient() {
		return id_patient;
	}

	public void setId_patient(String id_patient) {
		this.id_patient = id_patient;
	}

	public String getDate_entree() {
		return date_entree;
	}

	public void setDate_entree(String date_entree) {
		this.date_entree = date_entree;
	}

	public String getDate_sortie() {
		return date_sortie;
	}

	public void setDate_sortie(String date_sortie) {
		this.date_sortie = date_sortie;
	}
	
	public Hospitalisation(String idHospitalisation) {
		super();
		this.id_hospitalisation = idHospitalisation;
	}

	@Override
	public String toString() {
		return  "Hospitalisation : " + id_hospitalisation + "\nId : " + id_patient + "\nDate d'entrée : " + date_entree + "\nDate de sortie : "+ date_sortie + "\n- - -";
	}
}