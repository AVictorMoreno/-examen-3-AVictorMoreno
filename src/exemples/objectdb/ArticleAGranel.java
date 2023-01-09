/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemples.objectdb;

import javax.persistence.ManyToOne;

/**
 * Classe que representa un article que es ven a granel
 * @author professor
 */

public class ArticleAGranel extends Article {
    private static final long serialVersionUID = 1L;
    @ManyToOne
    private UnitatDeMesura unitat;

    /**
     *  Constructor per defecte
     */
    public ArticleAGranel() {
    }
    
    /**
     * Constructor que assigna les propietats
     * @param id identificador de l'article
     * @param descripcio descripcio de l'article
     * @param preu preu de l'article
     * @param estoc estoc actual de l'article
     * @param estocMinim estoc minim de l'article; si l'estoc n'esta per sota, caldria fer-ne una comanda
     * @param unitat unitat en que es mesura l'article
     */
    
    public ArticleAGranel(String id, String descripcio,  double preu, double estoc, double estocMinim, UnitatDeMesura unitat){
        super(id, descripcio, null, preu, estoc, estocMinim);
        this.unitat = unitat;
    }
    
    
    @Override
    public String toString() {
        return "ArticleAGranel [id=" + getId() + ", descripció=" + getDescripcio()+", marca=" + getMarca() 
                                                    + ", preu=" + getPreu() + ", unitat="+unitat.toString()+"]";    
    }

    /**
     * Obtenir la unitat de mesura de l'article
     * @return la unitat de mesura
     */
    public UnitatDeMesura getUnitat() {
        return unitat;
    }

    /**
     * Modificar la unitat de mesura de l'article
     * @param unitat unitat de mesura a assignar a l'article
     */
    public void setUnitat(UnitatDeMesura unitat) {
        this.unitat = unitat;
    }
    
}
