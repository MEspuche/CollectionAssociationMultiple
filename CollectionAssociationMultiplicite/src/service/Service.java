package service;

import java.util.Collection;

import metier.Personne;
import metier.Voiture;

public class Service implements Iservice {

	@Override
	public void ajouterVoiture(Personne p, Voiture v) {
		// TODO Auto-generated method stub
		Collection<Voiture> col = p.getMesVoitures();
		col.add(v);
		p.setMesVoitures(col);
		v.setPropriétaire(p);
	}

	@Override
	public Collection<Voiture> afficheVoiture(Personne p) {
		// TODO Auto-generated method stub
		return p.getMesVoitures();
	}

}
