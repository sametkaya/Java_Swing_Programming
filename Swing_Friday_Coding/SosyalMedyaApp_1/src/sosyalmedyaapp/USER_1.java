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
@Table(name = "TBL_USER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "USER_1.findAll", query = "SELECT u FROM USER_1 u")
    , @NamedQuery(name = "USER_1.findById", query = "SELECT u FROM USER_1 u WHERE u.id = :id")
    , @NamedQuery(name = "USER_1.findByKullaniciAdi", query = "SELECT u FROM USER_1 u WHERE u.kullaniciAdi = :kullaniciAdi")
    , @NamedQuery(name = "USER_1.findByAdi", query = "SELECT u FROM USER_1 u WHERE u.adi = :adi")
    , @NamedQuery(name = "USER_1.findBySoyadi", query = "SELECT u FROM USER_1 u WHERE u.soyadi = :soyadi")
    , @NamedQuery(name = "USER_1.findBySifre", query = "SELECT u FROM USER_1 u WHERE u.sifre = :sifre")
    , @NamedQuery(name = "USER_1.findByCinsiyet", query = "SELECT u FROM USER_1 u WHERE u.cinsiyet = :cinsiyet")})
public class USER_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "KULLANICI_ADI")
    private String kullaniciAdi;
    @Basic(optional = false)
    @Column(name = "ADI")
    private String adi;
    @Basic(optional = false)
    @Column(name = "SOYADI")
    private String soyadi;
    @Basic(optional = false)
    @Column(name = "SIFRE")
    private String sifre;
    @Basic(optional = false)
    @Column(name = "CINSIYET")
    private Boolean cinsiyet;

    public USER_1() {
    }

    public USER_1(Integer id) {
        this.id = id;
    }

    public USER_1(Integer id, String kullaniciAdi, String adi, String soyadi, String sifre, Boolean cinsiyet) {
        this.id = id;
        this.kullaniciAdi = kullaniciAdi;
        this.adi = adi;
        this.soyadi = soyadi;
        this.sifre = sifre;
        this.cinsiyet = cinsiyet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
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

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public Boolean getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Boolean cinsiyet) {
        this.cinsiyet = cinsiyet;
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
        if (!(object instanceof USER_1)) {
            return false;
        }
        USER_1 other = (USER_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sosyalmedyaapp.USER_1[ id=" + id + " ]";
    }
    
}
