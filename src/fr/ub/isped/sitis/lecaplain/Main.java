package fr.ub.isped.sitis.lecaplain;

import java.util.Scanner;

public class Main {
public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - Patient de sexe f�minin"
				+"\n2 - Information relative � un patient en connaissant son identifiant"
				+"\n3 - Information relative � une hospitalisation"
				+"\nVeuillez saisir le num�ro de la requ�te souhait�e :");
		String source = sc.nextLine();
		int numero = Integer.parseInt(source);
		
		Dao d = new Dao();
		d.DAO(numero);
		}
}
