/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab12;

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
@Table(name = "PERSONEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personel.findAll", query = "SELECT p FROM Personel p")
    , @NamedQuery(name = "Personel.findByPerId", query = "SELECT p FROM Personel p WHERE p.perId = :perId")
    , @NamedQuery(name = "Personel.findByAdi", query = "SELECT p FROM Personel p WHERE p.adi = :adi")
    , @NamedQuery(name = "Personel.findByBirim", query = "SELECT p FROM Personel p WHERE p.birim = :birim")
    , @NamedQuery(name = "Personel.findByMaas", query = "SELECT p FROM Personel p WHERE p.maas = :maas")})
public class Personel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PER_ID")
    private Integer perId;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "BIRIM")
    private String birim;
    @Column(name = "MAAS")
    private Integer maas;

    public Personel() {
    }

    public Personel(Integer perId) {
        this.perId = perId;
    }

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public Integer getMaas() {
        return maas;
    }

    public void setMaas(Integer maas) {
        this.maas = maas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perId != null ? perId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personel)) {
            return false;
        }
        Personel other = (Personel) object;
        if ((this.perId == null && other.perId != null) || (this.perId != null && !this.perId.equals(other.perId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bp2_lab12.Personel[ perId=" + perId + " ]";
    }
    
}
