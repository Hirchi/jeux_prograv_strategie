package fr.insarouen.asi.prog.asiaventure.Main;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.Monde;


public class ClasseMain{
    public static void main(String args[]){
	Monde monde1 = new Monde("monde1"), monde2 = new Monde("monde1"), monde3 = new Monde("monde3");
	Entite e1 = new Entite("nom1",monde1), e2 = new Entite("nom1",monde1), e3 = new Entite("nom3",monde3);

	System.out.println("e1 = e2 ?" + e1.equals(e2));
	System.out.println("e1 = e3 ?" + e1.equals(e3));
	System.out.println(e3.toString());
	System.out.println("avant ajout " + monde1.toString());
	monde1.ajouter(e3);
	System.out.println("apres ajout " + monde1.toString());
    }
}
