package metier;

public class Voiture {

	private int idVoiture;
	private String marque;
	private String couleur;
	
	private Personne propri�taire;

	public Personne getPropri�taire() {
		return propri�taire;
	}

	public void setPropri�taire(Personne propri�taire) {
		this.propri�taire = propri�taire;
	}

	public Voiture(int idVoiture, String marque, String couleur) {
		super();
		this.idVoiture = idVoiture;
		this.marque = marque;
		this.couleur = couleur;
	}

	public int getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", marque=" + marque + ", couleur=" + couleur + " ]";
	}
	
	
}
