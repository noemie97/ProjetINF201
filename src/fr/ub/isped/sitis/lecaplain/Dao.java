package fr.ub.isped.sitis.lecaplain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import fr.ub.isped.sitis.lecaplain.Acte;
import fr.ub.isped.sitis.lecaplain.Diagnostic;
import fr.ub.isped.sitis.lecaplain.Hospitalisation;
import fr.ub.isped.sitis.lecaplain.Patient;
import fr.ub.isped.sitis.lecaplain.Ccam;
import fr.ub.isped.sitis.lecaplain.Cim10;

public class Dao {
	
	public void DAO(int numero) {
		
		switch(numero){
			case 1:				
				try {
				//Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root","");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from tab_patient where sexe = 2");
				
				while(rs.next()) {
					String idPatient = rs.getString(1);
					String sexe = rs.getString(2);
					String date_naissance = rs.getString(3);
					String prenom = rs.getString(4);
					String nom = rs.getString(5);
					
					Patient p = new Patient(idPatient,sexe,date_naissance,prenom,nom);
					
					System.out.println(p);
				}
				
				con.close();
				} catch(SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 2:
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Veuillez saisir l'identifiant du patient :");
				String identifiantPatient = sc2.nextLine();
				
				try {
				//Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root","");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from tab_patient where ID_PATIENT like '"+identifiantPatient+"'");
				
				while(rs.next()) {
					String id_patient = rs.getString(1);
					String sexe = rs.getString(2);
					String date_naissance = rs.getString(3);
					String prenom = rs.getString(4);
					String nom = rs.getString(5);
					
					Patient p = new Patient(id_patient,sexe,date_naissance,prenom,nom);
					
					System.out.println(p);
				}
				
				con.close();
				} catch(SQLException e) {
					System.out.println("Erreur");
				}
				break;
				
			case 3:
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Veuillez saisir l'identifiant de l'hospitalisation :");
				String identifiantHospitalisation = sc3.nextLine();
				
				try {
					//Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root","");
					
					Statement st = con.createStatement();
					
					ResultSet rs = st.executeQuery("select * from tab_hospitalisation where ID_HOSPITALISATION like '"+identifiantHospitalisation+"'");
					
					while(rs.next()) {
						String id_hospitalisation = rs.getString(1);
						String id_patient = rs.getString(2);
						String date_entree = rs.getString(3);
						String date_sortie = rs.getString(4);
						
							
						Hospitalisation h = new Hospitalisation(id_hospitalisation,id_patient,date_entree,date_sortie);
							
						System.out.println(h);
					}
					
					con.close();
					} catch(SQLException e) {
						System.out.println("Erreur");
					}
				break;
		}
	}

}
