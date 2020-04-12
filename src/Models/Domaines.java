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
@Table(name = "domaines", catalog = "db_bosy", schema = "")
@NamedQueries({
    @NamedQuery(name = "Domaines.findAll", query = "SELECT d FROM Domaines d")
    , @NamedQuery(name = "Domaines.findByIdDomaine", query = "SELECT d FROM Domaines d WHERE d.idDomaine = :idDomaine")
    , @NamedQuery(name = "Domaines.findByCodeDomaine", query = "SELECT d FROM Domaines d WHERE d.codeDomaine = :codeDomaine")
    , @NamedQuery(name = "Domaines.findByLibelleDomaine", query = "SELECT d FROM Domaines d WHERE d.libelleDomaine = :libelleDomaine")})
public class Domaines implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDomaine")
    private Integer idDomaine;
    @Basic(optional = false)
    @Column(name = "CodeDomaine")
    private String codeDomaine;
    @Basic(optional = false)
    @Column(name = "LibelleDomaine")
    private String libelleDomaine;

    public Domaines() {
    }

    public Domaines(Integer idDomaine) {
        this.idDomaine = idDomaine;
    }

    public Domaines(Integer idDomaine, String codeDomaine, String libelleDomaine) {
        this.idDomaine = idDomaine;
        this.codeDomaine = codeDomaine;
        this.libelleDomaine = libelleDomaine;
    }

    public Integer getIdDomaine() {
        return idDomaine;
    }

    public void setIdDomaine(Integer idDomaine) {
        Integer oldIdDomaine = this.idDomaine;
        this.idDomaine = idDomaine;
        changeSupport.firePropertyChange("idDomaine", oldIdDomaine, idDomaine);
    }

    public String getCodeDomaine() {
        return codeDomaine;
    }

    public void setCodeDomaine(String codeDomaine) {
        String oldCodeDomaine = this.codeDomaine;
        this.codeDomaine = codeDomaine;
        changeSupport.firePropertyChange("codeDomaine", oldCodeDomaine, codeDomaine);
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
        hash += (idDomaine != null ? idDomaine.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Domaines)) {
            return false;
        }
        Domaines other = (Domaines) object;
        if ((this.idDomaine == null && other.idDomaine != null) || (this.idDomaine != null && !this.idDomaine.equals(other.idDomaine))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vues.Domaines[ idDomaine=" + idDomaine + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
