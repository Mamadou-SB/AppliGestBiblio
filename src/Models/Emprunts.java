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
@Table(name = "emprunts", catalog = "db_bosy", schema = "")
@NamedQueries({
    @NamedQuery(name = "Emprunts.findAll", query = "SELECT e FROM Emprunts e")
    , @NamedQuery(name = "Emprunts.findByIdEmprunt", query = "SELECT e FROM Emprunts e WHERE e.idEmprunt = :idEmprunt")
    , @NamedQuery(name = "Emprunts.findByDateEmprunt", query = "SELECT e FROM Emprunts e WHERE e.dateEmprunt = :dateEmprunt")
    , @NamedQuery(name = "Emprunts.findByDateRetour", query = "SELECT e FROM Emprunts e WHERE e.dateRetour = :dateRetour")
    , @NamedQuery(name = "Emprunts.findByTitre", query = "SELECT e FROM Emprunts e WHERE e.titre = :titre")
    , @NamedQuery(name = "Emprunts.findByTypeOuvrage", query = "SELECT e FROM Emprunts e WHERE e.typeOuvrage = :typeOuvrage")
    , @NamedQuery(name = "Emprunts.findByEmprunteur", query = "SELECT e FROM Emprunts e WHERE e.emprunteur = :emprunteur")
    , @NamedQuery(name = "Emprunts.findByRendu", query = "SELECT e FROM Emprunts e WHERE e.rendu = :rendu")})
public class Emprunts implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmprunt")
    private Integer idEmprunt;
    @Basic(optional = false)
    @Column(name = "DateEmprunt")
    private String dateEmprunt;
    @Basic(optional = false)
    @Column(name = "DateRetour")
    private String dateRetour;
    @Basic(optional = false)
    @Column(name = "Titre")
    private String titre;
    @Basic(optional = false)
    @Column(name = "TypeOuvrage")
    private int typeOuvrage;
    @Basic(optional = false)
    @Column(name = "Emprunteur")
    private String emprunteur;
    @Basic(optional = false)
    @Column(name = "Rendu")
    private String rendu;

    public Emprunts() {
    }

    public Emprunts(Integer idEmprunt) {
        this.idEmprunt = idEmprunt;
    }

    public Emprunts(Integer idEmprunt, String dateEmprunt, String dateRetour, String titre, int typeOuvrage, String emprunteur, String rendu) {
        this.idEmprunt = idEmprunt;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
        this.titre = titre;
        this.typeOuvrage = typeOuvrage;
        this.emprunteur = emprunteur;
        this.rendu = rendu;
    }

    public Integer getIdEmprunt() {
        return idEmprunt;
    }

    public void setIdEmprunt(Integer idEmprunt) {
        Integer oldIdEmprunt = this.idEmprunt;
        this.idEmprunt = idEmprunt;
        changeSupport.firePropertyChange("idEmprunt", oldIdEmprunt, idEmprunt);
    }

    public String getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(String dateEmprunt) {
        String oldDateEmprunt = this.dateEmprunt;
        this.dateEmprunt = dateEmprunt;
        changeSupport.firePropertyChange("dateEmprunt", oldDateEmprunt, dateEmprunt);
    }

    public String getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(String dateRetour) {
        String oldDateRetour = this.dateRetour;
        this.dateRetour = dateRetour;
        changeSupport.firePropertyChange("dateRetour", oldDateRetour, dateRetour);
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        String oldTitre = this.titre;
        this.titre = titre;
        changeSupport.firePropertyChange("titre", oldTitre, titre);
    }

    public int getTypeOuvrage() {
        return typeOuvrage;
    }

    public void setTypeOuvrage(int typeOuvrage) {
        int oldTypeOuvrage = this.typeOuvrage;
        this.typeOuvrage = typeOuvrage;
        changeSupport.firePropertyChange("typeOuvrage", oldTypeOuvrage, typeOuvrage);
    }

    public String getEmprunteur() {
        return emprunteur;
    }

    public void setEmprunteur(String emprunteur) {
        String oldEmprunteur = this.emprunteur;
        this.emprunteur = emprunteur;
        changeSupport.firePropertyChange("emprunteur", oldEmprunteur, emprunteur);
    }

    public String getRendu() {
        return rendu;
    }

    public void setRendu(String rendu) {
        String oldRendu = this.rendu;
        this.rendu = rendu;
        changeSupport.firePropertyChange("rendu", oldRendu, rendu);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmprunt != null ? idEmprunt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emprunts)) {
            return false;
        }
        Emprunts other = (Emprunts) object;
        if ((this.idEmprunt == null && other.idEmprunt != null) || (this.idEmprunt != null && !this.idEmprunt.equals(other.idEmprunt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vues.Emprunts[ idEmprunt=" + idEmprunt + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
