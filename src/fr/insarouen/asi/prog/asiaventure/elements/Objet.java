package fr.insarouen.asi.prog.asiaventure.elements;
import fr.insarouen.asi.prog.asiaventure.elements.Etat;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.Monde;

public class Objet extends Entite{
    
    public Objet(){
	super();
    }

    public Objet(String nom, Monde monde){
	super(nom,monde);
    }
    
    public boolean estDeplacable(){
	return false;
    }
}
