package metier;

import java.util.ArrayList;
import java.util.Collection;

public class Personne {

	private int id;
	private String prenom;
	private String nom;
	
	private Collection <Voiture> mesVoitures = new ArrayList<Voiture>();

	public Personne(int id, String prenom, String nom) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
	}

	public Personne() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Personne [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", mesVoitures=" + mesVoitures + "]";
	}

	public Collection<Voiture> getMesVoitures() {
		return mesVoitures;
	}

	public void setMesVoitures(Collection<Voiture> mesVoitures) {
		this.mesVoitures = mesVoitures;
	}
	
	
	
}
