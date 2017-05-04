/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosyalmedyaapp;

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
@Table(name = "TBL_ARKADASLIK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ARKADASLIK.findAll", query = "SELECT a FROM ARKADASLIK a")
    , @NamedQuery(name = "ARKADASLIK.findById", query = "SELECT a FROM ARKADASLIK a WHERE a.id = :id")
    , @NamedQuery(name = "ARKADASLIK.findByIdUserIstek", query = "SELECT a FROM ARKADASLIK a WHERE a.idUserIstek = :idUserIstek")
    , @NamedQuery(name = "ARKADASLIK.findByIdUserKabul", query = "SELECT a FROM ARKADASLIK a WHERE a.idUserKabul = :idUserKabul")
    , @NamedQuery(name = "ARKADASLIK.findByKabulDurumu", query = "SELECT a FROM ARKADASLIK a WHERE a.kabulDurumu = :kabulDurumu")})
public class ARKADASLIK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ID_USER_ISTEK")
    private int idUserIstek;
    @Basic(optional = false)
    @Column(name = "ID_USER_KABUL")
    private int idUserKabul;
    @Basic(optional = false)
    @Column(name = "KABUL_DURUMU")
    private Boolean kabulDurumu;

    public ARKADASLIK() {
    }

    public ARKADASLIK(Integer id) {
        this.id = id;
    }

    public ARKADASLIK(Integer id, int idUserIstek, int idUserKabul, Boolean kabulDurumu) {
        this.id = id;
        this.idUserIstek = idUserIstek;
        this.idUserKabul = idUserKabul;
        this.kabulDurumu = kabulDurumu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdUserIstek() {
        return idUserIstek;
    }

    public void setIdUserIstek(int idUserIstek) {
        this.idUserIstek = idUserIstek;
    }

    public int getIdUserKabul() {
        return idUserKabul;
    }

    public void setIdUserKabul(int idUserKabul) {
        this.idUserKabul = idUserKabul;
    }

    public Boolean getKabulDurumu() {
        return kabulDurumu;
    }

    public void setKabulDurumu(Boolean kabulDurumu) {
        this.kabulDurumu = kabulDurumu;
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
        if (!(object instanceof ARKADASLIK)) {
            return false;
        }
        ARKADASLIK other = (ARKADASLIK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sosyalmedyaapp.ARKADASLIK[ id=" + id + " ]";
    }
    
}
