package fr.ub.isped.sitis.lecaplain;

public class Patient {

	//Attributs
	private String id_patient;
	private String sexe;
	private String date_naissance;
	private String prenom;
	private String nom;

	//Constructeur
	public Patient(String id_patient, String sexe, String date_naissance, String prenom, String nom) {
		super();
		this.id_patient = id_patient;
		this.sexe = sexe;
		this.date_naissance = date_naissance;
		this.prenom = prenom;
		this.nom = nom;
	}

	//getters, setters
	public String getId_patient() {
		return id_patient;
	}

	public void setId_patient(String id_patient) {
		this.id_patient = id_patient;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Patient(String id_patient) {
		super();
		this.id_patient = id_patient;
	}

	@Override
	public String toString() {
		return "id : " + id_patient + "\nSexe : " + sexe + "\nDate de Naissance : " + date_naissance + "\nNom : "+ nom + "\nPrenom : " + prenom + "\n- - -";
	}
}