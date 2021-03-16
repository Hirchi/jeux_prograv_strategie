package fr.insarouen.asi.prog.asiaventure.elements;
import fr.insarouen.asi.prog.asiaventure.elements.Etat;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.Objet;
import fr.insarouen.asi.prog.asiaventure.elements.Monde;

public class PiedDeBiche extends Objet{

    public PiedDeBiche(Monde monde){
	super("PiedDeBiche",monde);
    }
    
    public boolean estDeplacable(){
	return true;
    }
}
