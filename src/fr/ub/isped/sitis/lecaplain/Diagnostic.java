package fr.ub.isped.sitis.lecaplain;

public class Diagnostic {

	//Attributs
	private String id_disgnoctic;
	private String id_hospitalisation;
	private String code_cim10;
	private String drang;
	private String dgtype;

	//Constructeur
	public Diagnostic(String id_disgnoctic, String id_hospitalisation, String code_cim10, String drang, String dgtype) {
		super();
		this.id_disgnoctic = id_disgnoctic;
		this.id_hospitalisation = id_hospitalisation;
		this.code_cim10 = code_cim10;
		this.drang = drang;
		this.dgtype = dgtype;
	}

	//getters, setters
	public String getId_disgnoctic() {
		return id_disgnoctic;
	}

	public void setId_disgnoctic(String id_disgnoctic) {
		this.id_disgnoctic = id_disgnoctic;
	}

	public String getId_hospitalisation() {
		return id_hospitalisation;
	}

	public void setId_hospitalisation(String id_hospitalisation) {
		this.id_hospitalisation = id_hospitalisation;
	}

	public String getCode_cim10() {
		return code_cim10;
	}

	public void setCode_cim10(String code_cim10) {
		this.code_cim10 = code_cim10;
	}

	public String getDrang() {
		return drang;
	}

	public void setDrang(String drang) {
		this.drang = drang;
	}

	public String getDgtype() {
		return dgtype;
	}

	public void setDgtype(String dgtype) {
		this.dgtype = dgtype;
	}

	@Override
	public String toString() {
		return "id : " + id_disgnoctic + "\nHospitalisation : " + id_hospitalisation + "\nCode CIM10 : " + code_cim10 + "\nRang du diagnostic : "+ drang + "\nType : " + dgtype + "\n- - -";
	}
}

