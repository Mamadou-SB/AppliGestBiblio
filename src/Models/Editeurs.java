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
@Table(name = "editeurs", catalog = "db_bosy", schema = "")
@NamedQueries({
    @NamedQuery(name = "Editeurs.findAll", query = "SELECT e FROM Editeurs e")
    , @NamedQuery(name = "Editeurs.findByIdEditeur", query = "SELECT e FROM Editeurs e WHERE e.idEditeur = :idEditeur")
    , @NamedQuery(name = "Editeurs.findByCodeEditeur", query = "SELECT e FROM Editeurs e WHERE e.codeEditeur = :codeEditeur")
    , @NamedQuery(name = "Editeurs.findByNomEditeur", query = "SELECT e FROM Editeurs e WHERE e.nomEditeur = :nomEditeur")})
public class Editeurs implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEditeur")
    private Integer idEditeur;
    @Basic(optional = false)
    @Column(name = "CodeEditeur")
    private String codeEditeur;
    @Basic(optional = false)
    @Column(name = "NomEditeur")
    private String nomEditeur;

    public Editeurs() {
    }

    public Editeurs(Integer idEditeur) {
        this.idEditeur = idEditeur;
    }

    public Editeurs(Integer idEditeur, String codeEditeur, String nomEditeur) {
        this.idEditeur = idEditeur;
        this.codeEditeur = codeEditeur;
        this.nomEditeur = nomEditeur;
    }

    public Integer getIdEditeur() {
        return idEditeur;
    }

    public void setIdEditeur(Integer idEditeur) {
        Integer oldIdEditeur = this.idEditeur;
        this.idEditeur = idEditeur;
        changeSupport.firePropertyChange("idEditeur", oldIdEditeur, idEditeur);
    }

    public String getCodeEditeur() {
        return codeEditeur;
    }

    public void setCodeEditeur(String codeEditeur) {
        String oldCodeEditeur = this.codeEditeur;
        this.codeEditeur = codeEditeur;
        changeSupport.firePropertyChange("codeEditeur", oldCodeEditeur, codeEditeur);
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
        hash += (idEditeur != null ? idEditeur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Editeurs)) {
            return false;
        }
        Editeurs other = (Editeurs) object;
        if ((this.idEditeur == null && other.idEditeur != null) || (this.idEditeur != null && !this.idEditeur.equals(other.idEditeur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vues.Editeurs[ idEditeur=" + idEditeur + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
