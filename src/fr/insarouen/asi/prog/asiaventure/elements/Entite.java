package fr.insarouen.asi.prog.asiaventure.elements;
import java.lang.String;
import fr.insarouen.asi.prog.asiaventure.elements.Monde;
import java.lang.Object;

public class Entite{
    private String nom;
    private Monde monde;

    public Entite(){
    }
    
    public Entite(String nom, Monde monde){
	this.nom = nom;
	this.monde = monde;
	this.monde.ajouter(this);
    }

    public String getNom(){
	return this.nom;
    }

    public Monde getMonde(){
	return this.monde;
    }

    public String toString(){
	return String.format("Nom Entite : %s, Nom Monde : %s ",nom.toString(),this.monde.getNom());
    }

    public boolean equals(Object o){
	if (o==this){
	    return true;
	}
	if (o==null || !(this.getClass() == o.getClass())){
	    return false;
	}
	Entite e = (Entite) o;
	return (this.getNom().equals(e.getNom()) && (e.getMonde() == this.monde));
    }
	    
}
