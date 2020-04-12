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
@Table(name = "nature_ouvrages", catalog = "db_bosy", schema = "")
@NamedQueries({
    @NamedQuery(name = "NatureOuvrages.findAll", query = "SELECT n FROM NatureOuvrages n")
    , @NamedQuery(name = "NatureOuvrages.findByIdOuvrage", query = "SELECT n FROM NatureOuvrages n WHERE n.idOuvrage = :idOuvrage")
    , @NamedQuery(name = "NatureOuvrages.findByCodeOuvrage", query = "SELECT n FROM NatureOuvrages n WHERE n.codeOuvrage = :codeOuvrage")
    , @NamedQuery(name = "NatureOuvrages.findByTypeOuvrage", query = "SELECT n FROM NatureOuvrages n WHERE n.typeOuvrage = :typeOuvrage")
    , @NamedQuery(name = "NatureOuvrages.findByLibelleDomaine", query = "SELECT n FROM NatureOuvrages n WHERE n.libelleDomaine = :libelleDomaine")})
public class NatureOuvrages implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOuvrage")
    private Integer idOuvrage;
    @Basic(optional = false)
    @Column(name = "CodeOuvrage")
    private String codeOuvrage;
    @Basic(optional = false)
    @Column(name = "TypeOuvrage")
    private String typeOuvrage;
    @Basic(optional = false)
    @Column(name = "LibelleDomaine")
    private String libelleDomaine;

    public NatureOuvrages() {
    }

    public NatureOuvrages(Integer idOuvrage) {
        this.idOuvrage = idOuvrage;
    }

    public NatureOuvrages(Integer idOuvrage, String codeOuvrage, String typeOuvrage, String libelleDomaine) {
        this.idOuvrage = idOuvrage;
        this.codeOuvrage = codeOuvrage;
        this.typeOuvrage = typeOuvrage;
        this.libelleDomaine = libelleDomaine;
    }

    public Integer getIdOuvrage() {
        return idOuvrage;
    }

    public void setIdOuvrage(Integer idOuvrage) {
        Integer oldIdOuvrage = this.idOuvrage;
        this.idOuvrage = idOuvrage;
        changeSupport.firePropertyChange("idOuvrage", oldIdOuvrage, idOuvrage);
    }

    public String getCodeOuvrage() {
        return codeOuvrage;
    }

    public void setCodeOuvrage(String codeOuvrage) {
        String oldCodeOuvrage = this.codeOuvrage;
        this.codeOuvrage = codeOuvrage;
        changeSupport.firePropertyChange("codeOuvrage", oldCodeOuvrage, codeOuvrage);
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
        hash += (idOuvrage != null ? idOuvrage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NatureOuvrages)) {
            return false;
        }
        NatureOuvrages other = (NatureOuvrages) object;
        if ((this.idOuvrage == null && other.idOuvrage != null) || (this.idOuvrage != null && !this.idOuvrage.equals(other.idOuvrage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vues.NatureOuvrages[ idOuvrage=" + idOuvrage + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
