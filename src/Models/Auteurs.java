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
@Table(name = "auteurs", catalog = "db_bosy", schema = "")
@NamedQueries({
    @NamedQuery(name = "Auteurs.findAll", query = "SELECT a FROM Auteurs a")
    , @NamedQuery(name = "Auteurs.findByIdAuteur", query = "SELECT a FROM Auteurs a WHERE a.idAuteur = :idAuteur")
    , @NamedQuery(name = "Auteurs.findByCodeAuteur", query = "SELECT a FROM Auteurs a WHERE a.codeAuteur = :codeAuteur")
    , @NamedQuery(name = "Auteurs.findByNomAuteur", query = "SELECT a FROM Auteurs a WHERE a.nomAuteur = :nomAuteur")})
public class Auteurs implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAuteur")
    private Integer idAuteur;
    @Basic(optional = false)
    @Column(name = "CodeAuteur")
    private String codeAuteur;
    @Basic(optional = false)
    @Column(name = "NomAuteur")
    private String nomAuteur;

    public Auteurs() {
    }

    public Auteurs(Integer idAuteur) {
        this.idAuteur = idAuteur;
    }

    public Auteurs(Integer idAuteur, String codeAuteur, String nomAuteur) {
        this.idAuteur = idAuteur;
        this.codeAuteur = codeAuteur;
        this.nomAuteur = nomAuteur;
    }

    public Integer getIdAuteur() {
        return idAuteur;
    }

    public void setIdAuteur(Integer idAuteur) {
        Integer oldIdAuteur = this.idAuteur;
        this.idAuteur = idAuteur;
        changeSupport.firePropertyChange("idAuteur", oldIdAuteur, idAuteur);
    }

    public String getCodeAuteur() {
        return codeAuteur;
    }

    public void setCodeAuteur(String codeAuteur) {
        String oldCodeAuteur = this.codeAuteur;
        this.codeAuteur = codeAuteur;
        changeSupport.firePropertyChange("codeAuteur", oldCodeAuteur, codeAuteur);
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        String oldNomAuteur = this.nomAuteur;
        this.nomAuteur = nomAuteur;
        changeSupport.firePropertyChange("nomAuteur", oldNomAuteur, nomAuteur);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAuteur != null ? idAuteur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auteurs)) {
            return false;
        }
        Auteurs other = (Auteurs) object;
        if ((this.idAuteur == null && other.idAuteur != null) || (this.idAuteur != null && !this.idAuteur.equals(other.idAuteur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vues.Auteurs[ idAuteur=" + idAuteur + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
