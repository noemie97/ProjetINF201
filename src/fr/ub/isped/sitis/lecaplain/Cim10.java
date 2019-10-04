package fr.ub.isped.sitis.lecaplain;

public class Cim10 {
	//Attributs
		private String id_cim10;
		private String libelle_cim110;

		//Constructeur
		public Cim10(String id_cim10, String libelle_cim10) {
			super();
			this.id_cim10 = id_cim10;
			this.libelle_cim110 = libelle_cim10;
		}

		//Getters, setters
		public String getId_cim10() {
			return id_cim10;
		}

		public void setId_cim10(String id_cim10) {
			this.id_cim10 = id_cim10;
		}

		public String getLibelle_cim110() {
			return libelle_cim110;
		}

		public void setLibelle_cim110(String libelle_cim110) {
			this.libelle_cim110 = libelle_cim110;
		}

		@Override
		public String toString() {
			return "Id CIM10: " + id_cim10 + "\nLibelle CIM10 : " + libelle_cim110 + "\n- - -";
		}

}
