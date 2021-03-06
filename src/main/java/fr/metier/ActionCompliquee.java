/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.metier;

import java.text.NumberFormat;
import java.util.HashMap;

/**
 *
 * @author Jiayin LI
 */
public class ActionCompliquee extends Action {

    private HashMap<ActionSimple, Proportion> tblComposition;

    public ActionCompliquee(String nom) {
        super(nom);
        this.tblComposition = new HashMap<ActionSimple, Proportion>();
    }
    
    
    @Override
    public float valeur(Jour j) {
        double total;
        
        total = 0;
        
         // parcours des clefs
        for(ActionSimple act : this.tblComposition.keySet()) {
            total = total + 
                    (act.valeur(j) * (double)this.tblComposition.get(act).getPourcentage());
        }
        return (float)total;
    }
    
    public void enrgProportion(ActionSimple as, float pourcentage) {
        if(this.tblComposition.containsKey(as) == true)
            this.tblComposition.remove(as);
           
        this.tblComposition.put(as, new Proportion(pourcentage));
    }
    
    @Override
    public String toString() {
        return this.getNom() +"=>" + this.tblComposition.toString(); 
    }
    private class Proportion {

        private float pourcentage;

        /**
         * Get the value of pourcentage
         *
         * @return the value of pourcentage
         */
        public float getPourcentage() {
            return pourcentage;
        }

        public Proportion(float pourcentage) {
            this.pourcentage = pourcentage;
        }

        @Override
        public String toString() {
            return NumberFormat.getPercentInstance().format(pourcentage);
        }
    }
}
