package fr.ub.isped.sitis.lecaplain;

public class Ccam {
	//attributs
		private String id_ccam;
		private String libelle_ccam;

		//Constructeurs
		public Ccam(String id_ccam, String libelle_ccam) {
			super();
			this.id_ccam = id_ccam;
			this.libelle_ccam = libelle_ccam;
		}

		//Getters, setters
		public String getId_ccam() {
			return id_ccam;
		}

		public void setId_ccam(String id_ccam) {
			this.id_ccam = id_ccam;
		}

		public String getLibelle_ccam() {
			return libelle_ccam;
		}

		public void setLibelle_ccam(String libelle_ccam) {
			this.libelle_ccam = libelle_ccam;
		}

		@Override
		public String toString() {
			return "Id CCAM: " + id_ccam + "\nLibelle CCAM : " + libelle_ccam + "\n- - -";
		}


}
