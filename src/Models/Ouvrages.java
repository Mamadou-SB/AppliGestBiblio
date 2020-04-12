/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Samba
 */
@Entity
@Table(name = "ouvrages", catalog = "db_bosy", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ouvrages.findAll", query = "SELECT o FROM Ouvrages o")
    , @NamedQuery(name = "Ouvrages.findByIdLivre", query = "SELECT o FROM Ouvrages o WHERE o.idLivre = :idLivre")
    , @NamedQuery(name = "Ouvrages.findByIsbn", query = "SELECT o FROM Ouvrages o WHERE o.isbn = :isbn")
    , @NamedQuery(name = "Ouvrages.findByTitre", query = "SELECT o FROM Ouvrages o WHERE o.titre = :titre")
    , @NamedQuery(name = "Ouvrages.findByLanguelivre", query = "SELECT o FROM Ouvrages o WHERE o.languelivre = :languelivre")
    , @NamedQuery(name = "Ouvrages.findByAnneeparution", query = "SELECT o FROM Ouvrages o WHERE o.anneeparution = :anneeparution")
    , @NamedQuery(name = "Ouvrages.findByNbrpages", query = "SELECT o FROM Ouvrages o WHERE o.nbrpages = :nbrpages")
    , @NamedQuery(name = "Ouvrages.findByTypeOuvrage", query = "SELECT o FROM Ouvrages o WHERE o.typeOuvrage = :typeOuvrage")
    , @NamedQuery(name = "Ouvrages.findByLibelleDomaine", query = "SELECT o FROM Ouvrages o WHERE o.libelleDomaine = :libelleDomaine")
    , @NamedQuery(name = "Ouvrages.findByNomAuteur", query = "SELECT o FROM Ouvrages o WHERE o.nomAuteur = :nomAuteur")
    , @NamedQuery(name = "Ouvrages.findByNomEditeur", query = "SELECT o FROM Ouvrages o WHERE o.nomEditeur = :nomEditeur")})
public class Ouvrages implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLivre")
    private Integer idLivre;
    @Basic(optional = false)
    @Column(name = "ISBN")
    private String isbn;
    @Basic(optional = false)
    @Column(name = "Titre")
    private String titre;
    @Basic(optional = false)
    @Column(name = "Langue_livre")
    private String languelivre;
    @Basic(optional = false)
    @Column(name = "Annee_parution")
    private int anneeparution;
    @Basic(optional = false)
    @Column(name = "Nbr_pages")
    private int nbrpages;
    @Basic(optional = false)
    @Column(name = "TypeOuvrage")
    private String typeOuvrage;
    @Basic(optional = false)
    @Column(name = "LibelleDomaine")
    private String libelleDomaine;
    @Basic(optional = false)
    @Column(name = "NomAuteur")
    private String nomAuteur;
    @Basic(optional = false)
    @Column(name = "NomEditeur")
    private String nomEditeur;

    public Ouvrages() {
    }

    public Ouvrages(Integer idLivre) {
        this.idLivre = idLivre;
    }

    public Ouvrages(Integer idLivre, String isbn, String titre, String languelivre, int anneeparution, int nbrpages, String typeOuvrage, String libelleDomaine, String nomAuteur, String nomEditeur) {
        this.idLivre = idLivre;
        this.isbn = isbn;
        this.titre = titre;
        this.languelivre = languelivre;
        this.anneeparution = anneeparution;
        this.nbrpages = nbrpages;
        this.typeOuvrage = typeOuvrage;
        this.libelleDomaine = libelleDomaine;
        this.nomAuteur = nomAuteur;
        this.nomEditeur = nomEditeur;
    }

    public Integer getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(Integer idLivre) {
        Integer oldIdLivre = this.idLivre;
        this.idLivre = idLivre;
        changeSupport.firePropertyChange("idLivre", oldIdLivre, idLivre);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        String oldIsbn = this.isbn;
        this.isbn = isbn;
        changeSupport.firePropertyChange("isbn", oldIsbn, isbn);
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        String oldTitre = this.titre;
        this.titre = titre;
        changeSupport.firePropertyChange("titre", oldTitre, titre);
    }

    public String getLanguelivre() {
        return languelivre;
    }

    public void setLanguelivre(String languelivre) {
        String oldLanguelivre = this.languelivre;
        this.languelivre = languelivre;
        changeSupport.firePropertyChange("languelivre", oldLanguelivre, languelivre);
    }

    public int getAnneeparution() {
        return anneeparution;
    }

    public void setAnneeparution(int anneeparution) {
        int oldAnneeparution = this.anneeparution;
        this.anneeparution = anneeparution;
        changeSupport.firePropertyChange("anneeparution", oldAnneeparution, anneeparution);
    }

    public int getNbrpages() {
        return nbrpages;
    }

    public void setNbrpages(int nbrpages) {
        int oldNbrpages = this.nbrpages;
        this.nbrpages = nbrpages;
        changeSupport.firePropertyChange("nbrpages", oldNbrpages, nbrpages);
    }

    public String getTypeOuvrage() {
        return typeOuvrage;
    }

    public void setTypeOuvrage(String typeOuvrage) {
        String oldTypeOuvrage = this.typeOuvrage;
        this.typeOuvrage = typeOuvrage;
        changeSupport.firePropertyChange("typeOuvrage", oldTypeOuvrage, typeOuvrage);
    }

    public String getLibelleDomaine() {
        return libelleDomaine;
    }

    public void setLibelleDomaine(String libelleDomaine) {
        String oldLibelleDomaine = this.libelleDomaine;
        this.libelleDomaine = libelleDomaine;
        changeSupport.firePropertyChange("libelleDomaine", oldLibelleDomaine, libelleDomaine);
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        String oldNomAuteur = this.nomAuteur;
        this.nomAuteur = nomAuteur;
        changeSupport.firePropertyChange("nomAuteur", oldNomAuteur, nomAuteur);
    }

    public String getNomEditeur() {
        return nomEditeur;
    }

    public void setNomEditeur(String nomEditeur) {
        String oldNomEditeur = this.nomEditeur;
        this.nomEditeur = nomEditeur;
        changeSupport.firePropertyChange("nomEditeur", oldNomEditeur, nomEditeur);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLivre != null ? idLivre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ouvrages)) {
            return false;
        }
        Ouvrages other = (Ouvrages) object;
        if ((this.idLivre == null && other.idLivre != null) || (this.idLivre != null && !this.idLivre.equals(other.idLivre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vues.Ouvrages[ idLivre=" + idLivre + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
