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
@Table(name = "exemplaires", catalog = "db_bosy", schema = "")
@NamedQueries({
    @NamedQuery(name = "Exemplaires.findAll", query = "SELECT e FROM Exemplaires e")
    , @NamedQuery(name = "Exemplaires.findByIdExemplaire", query = "SELECT e FROM Exemplaires e WHERE e.idExemplaire = :idExemplaire")
    , @NamedQuery(name = "Exemplaires.findByTitre", query = "SELECT e FROM Exemplaires e WHERE e.titre = :titre")
    , @NamedQuery(name = "Exemplaires.findByNombreExemplaire", query = "SELECT e FROM Exemplaires e WHERE e.nombreExemplaire = :nombreExemplaire")
    , @NamedQuery(name = "Exemplaires.findByTypeOuvrage", query = "SELECT e FROM Exemplaires e WHERE e.typeOuvrage = :typeOuvrage")
    , @NamedQuery(name = "Exemplaires.findByLibelleDomaine", query = "SELECT e FROM Exemplaires e WHERE e.libelleDomaine = :libelleDomaine")})
public class Exemplaires implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idExemplaire")
    private Integer idExemplaire;
    @Basic(optional = false)
    @Column(name = "Titre")
    private String titre;
    @Basic(optional = false)
    @Column(name = "NombreExemplaire")
    private int nombreExemplaire;
    @Basic(optional = false)
    @Column(name = "TypeOuvrage")
    private String typeOuvrage;
    @Basic(optional = false)
    @Column(name = "LibelleDomaine")
    private String libelleDomaine;

    public Exemplaires() {
    }

    public Exemplaires(Integer idExemplaire) {
        this.idExemplaire = idExemplaire;
    }

    public Exemplaires(Integer idExemplaire, String titre, int nombreExemplaire, String typeOuvrage, String libelleDomaine) {
        this.idExemplaire = idExemplaire;
        this.titre = titre;
        this.nombreExemplaire = nombreExemplaire;
        this.typeOuvrage = typeOuvrage;
        this.libelleDomaine = libelleDomaine;
    }

    public Integer getIdExemplaire() {
        return idExemplaire;
    }

    public void setIdExemplaire(Integer idExemplaire) {
        Integer oldIdExemplaire = this.idExemplaire;
        this.idExemplaire = idExemplaire;
        changeSupport.firePropertyChange("idExemplaire", oldIdExemplaire, idExemplaire);
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        String oldTitre = this.titre;
        this.titre = titre;
        changeSupport.firePropertyChange("titre", oldTitre, titre);
    }

    public int getNombreExemplaire() {
        return nombreExemplaire;
    }

    public void setNombreExemplaire(int nombreExemplaire) {
        int oldNombreExemplaire = this.nombreExemplaire;
        this.nombreExemplaire = nombreExemplaire;
        changeSupport.firePropertyChange("nombreExemplaire", oldNombreExemplaire, nombreExemplaire);
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExemplaire != null ? idExemplaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exemplaires)) {
            return false;
        }
        Exemplaires other = (Exemplaires) object;
        if ((this.idExemplaire == null && other.idExemplaire != null) || (this.idExemplaire != null && !this.idExemplaire.equals(other.idExemplaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vues.Exemplaires[ idExemplaire=" + idExemplaire + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
