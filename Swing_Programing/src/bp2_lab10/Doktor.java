/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab10;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author samet
 */
@Entity
@Table(name = "DOKTOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doktor.findAll", query = "SELECT d FROM Doktor d")
    , @NamedQuery(name = "Doktor.findById", query = "SELECT d FROM Doktor d WHERE d.id = :id")
    , @NamedQuery(name = "Doktor.findByAdi", query = "SELECT d FROM Doktor d WHERE d.adi = :adi")
    , @NamedQuery(name = "Doktor.findBySoyadi", query = "SELECT d FROM Doktor d WHERE d.soyadi = :soyadi")})
public class Doktor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ADI")
    private String adi;
    @Basic(optional = false)
    @Column(name = "SOYADI")
    private String soyadi;

    public Doktor() {
    }

    public Doktor(Integer id) {
        this.id = id;
    }

    public Doktor(Integer id, String adi, String soyadi) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doktor)) {
            return false;
        }
        Doktor other = (Doktor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bp2_lab10.Doktor[ id=" + id + " ]";
    }
    
}
