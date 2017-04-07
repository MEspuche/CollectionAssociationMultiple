package presentation;

import metier.Personne;
import metier.Voiture;
import service.Iservice;
import service.Service;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Iservice is = new Service();
		Personne p1 = new Personne(1,"toto","titi");
		Personne p2 = new Personne(2,"abc","def");
		Personne p3 = new Personne(3,"ghi","jkl");
		
		Voiture v1 = new Voiture(1, "citroen", "noire");
		Voiture v2 = new Voiture(2, "peugeot", "rouge");
		Voiture v3 = new Voiture(3, "peugeot", "rouge");
		Voiture v4 = new Voiture(4, "renault", "verte");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("----------------------------------------");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
		is.ajouterVoiture(p1,v1);
		is.ajouterVoiture(p1,v2);
		is.ajouterVoiture(p2,v3);
		is.ajouterVoiture(p3,v4);
		
		
		System.out.println(p1);
		
		System.out.println(p2);
		
		System.out.println(p3);
		
		System.out.println("----------------------------------------");
		
		
	}

}
