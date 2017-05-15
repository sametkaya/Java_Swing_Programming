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
@Table(name = "SATIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Satis.findAll", query = "SELECT s FROM Satis s")
    , @NamedQuery(name = "Satis.findById", query = "SELECT s FROM Satis s WHERE s.id = :id")
    , @NamedQuery(name = "Satis.findByIdMusteri", query = "SELECT s FROM Satis s WHERE s.idMusteri = :idMusteri")
    , @NamedQuery(name = "Satis.findByIdMalzeme", query = "SELECT s FROM Satis s WHERE s.idMalzeme = :idMalzeme")
    , @NamedQuery(name = "Satis.findByTutar", query = "SELECT s FROM Satis s WHERE s.tutar = :tutar")
    , @NamedQuery(name = "Satis.findByAdet", query = "SELECT s FROM Satis s WHERE s.adet = :adet")})
public class Satis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ID_MUSTERI")
    private int idMusteri;
    @Basic(optional = false)
    @Column(name = "ID_MALZEME")
    private int idMalzeme;
    @Basic(optional = false)
    @Column(name = "TUTAR")
    private int tutar;
    @Basic(optional = false)
    @Column(name = "ADET")
    private int adet;

    public Satis() {
    }

    public Satis(Integer id) {
        this.id = id;
    }

    public Satis(Integer id, int idMusteri, int idMalzeme, int tutar, int adet) {
        this.id = id;
        this.idMusteri = idMusteri;
        this.idMalzeme = idMalzeme;
        this.tutar = tutar;
        this.adet = adet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdMusteri() {
        return idMusteri;
    }

    public void setIdMusteri(int idMusteri) {
        this.idMusteri = idMusteri;
    }

    public int getIdMalzeme() {
        return idMalzeme;
    }

    public void setIdMalzeme(int idMalzeme) {
        this.idMalzeme = idMalzeme;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
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
        if (!(object instanceof Satis)) {
            return false;
        }
        Satis other = (Satis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bp2_lab04.Satis[ id=" + id + " ]";
    }
    
}
