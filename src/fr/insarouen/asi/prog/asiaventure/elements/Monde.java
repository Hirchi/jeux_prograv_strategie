package fr.insarouen.asi.prog.asiaventure.elements;
import java.lang.String;
import java.util.Arrays;
import java.lang.StringBuilder;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;

public class Monde{

    private String nomDuMonde;
    private Entite[] lesEntites = new Entite[0];

    public Monde(String nomDuMonde){
	this.nomDuMonde = nomDuMonde;
    }

    public Entite getEntite(String nomEntite){
	for(int i = 0 ; i < this.lesEntites.length ; i++){
	    if(this.lesEntites[i].getNom().equals(nomEntite)){
		return this.lesEntites[i];
	    }
	}
	return null;
    }

    public String getNom(){
	return this.nomDuMonde;
    }

    public String toString(){
	StringBuilder strB = new StringBuilder(String.format("Monde : %s\n",this.nomDuMonde));
	for (int i = 0 ; i < this.lesEntites.length ; i++){
	    strB.append(lesEntites[i].toString());
	    }
	return strB.toString();
    }
    
    public void ajouter(Entite e){
	int j = 0;
	Entite[] temp = new Entite[this.lesEntites.length + 1];
	for(Entite i:this.lesEntites){
	    temp[j] = i;
	    j++;
	}
	temp[this.lesEntites.length] = e;
	this.lesEntites = temp;
    }
}
