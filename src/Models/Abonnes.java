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
@Table(name = "abonnes", catalog = "db_bosy", schema = "")
@NamedQueries({
    @NamedQuery(name = "Abonnes.findAll", query = "SELECT a FROM Abonnes a")
    , @NamedQuery(name = "Abonnes.findByIdAbonne", query = "SELECT a FROM Abonnes a WHERE a.idAbonne = :idAbonne")
    , @NamedQuery(name = "Abonnes.findByNumeroAb", query = "SELECT a FROM Abonnes a WHERE a.numeroAb = :numeroAb")
    , @NamedQuery(name = "Abonnes.findByNomAbonne", query = "SELECT a FROM Abonnes a WHERE a.nomAbonne = :nomAbonne")
    , @NamedQuery(name = "Abonnes.findByAdresse", query = "SELECT a FROM Abonnes a WHERE a.adresse = :adresse")
    , @NamedQuery(name = "Abonnes.findByNumTel", query = "SELECT a FROM Abonnes a WHERE a.numTel = :numTel")
    , @NamedQuery(name = "Abonnes.findByDateInscription", query = "SELECT a FROM Abonnes a WHERE a.dateInscription = :dateInscription")})
public class Abonnes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAbonne")
    private Integer idAbonne;
    @Basic(optional = false)
    @Column(name = "NumeroAb")
    private String numeroAb;
    @Basic(optional = false)
    @Column(name = "NomAbonne")
    private String nomAbonne;
    @Basic(optional = false)
    @Column(name = "Adresse")
    private String adresse;
    @Basic(optional = false)
    @Column(name = "NumTel")
    private String numTel;
    @Basic(optional = false)
    @Column(name = "DateInscription")
    private String dateInscription;

    public Abonnes() {
    }

    public Abonnes(Integer idAbonne) {
        this.idAbonne = idAbonne;
    }

    public Abonnes(Integer idAbonne, String numeroAb, String nomAbonne, String adresse, String numTel, String dateInscription) {
        this.idAbonne = idAbonne;
        this.numeroAb = numeroAb;
        this.nomAbonne = nomAbonne;
        this.adresse = adresse;
        this.numTel = numTel;
        this.dateInscription = dateInscription;
    }

    public Integer getIdAbonne() {
        return idAbonne;
    }

    public void setIdAbonne(Integer idAbonne) {
        Integer oldIdAbonne = this.idAbonne;
        this.idAbonne = idAbonne;
        changeSupport.firePropertyChange("idAbonne", oldIdAbonne, idAbonne);
    }

    public String getNumeroAb() {
        return numeroAb;
    }

    public void setNumeroAb(String numeroAb) {
        String oldNumeroAb = this.numeroAb;
        this.numeroAb = numeroAb;
        changeSupport.firePropertyChange("numeroAb", oldNumeroAb, numeroAb);
    }

    public String getNomAbonne() {
        return nomAbonne;
    }

    public void setNomAbonne(String nomAbonne) {
        String oldNomAbonne = this.nomAbonne;
        this.nomAbonne = nomAbonne;
        changeSupport.firePropertyChange("nomAbonne", oldNomAbonne, nomAbonne);
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        String oldAdresse = this.adresse;
        this.adresse = adresse;
        changeSupport.firePropertyChange("adresse", oldAdresse, adresse);
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        String oldNumTel = this.numTel;
        this.numTel = numTel;
        changeSupport.firePropertyChange("numTel", oldNumTel, numTel);
    }

    public String getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(String dateInscription) {
        String oldDateInscription = this.dateInscription;
        this.dateInscription = dateInscription;
        changeSupport.firePropertyChange("dateInscription", oldDateInscription, dateInscription);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAbonne != null ? idAbonne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abonnes)) {
            return false;
        }
        Abonnes other = (Abonnes) object;
        if ((this.idAbonne == null && other.idAbonne != null) || (this.idAbonne != null && !this.idAbonne.equals(other.idAbonne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vues.Abonnes[ idAbonne=" + idAbonne + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
