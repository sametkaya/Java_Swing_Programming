/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab10;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author samet
 */
@Entity
@Table(name = "HASTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hasta.findAll", query = "SELECT h FROM Hasta h")
    , @NamedQuery(name = "Hasta.findById", query = "SELECT h FROM Hasta h WHERE h.id = :id")
    , @NamedQuery(name = "Hasta.findByAdi", query = "SELECT h FROM Hasta h WHERE h.adi = :adi")
    , @NamedQuery(name = "Hasta.findBySoyadi", query = "SELECT h FROM Hasta h WHERE h.soyadi = :soyadi")
    , @NamedQuery(name = "Hasta.findByIdDoktor", query = "SELECT h FROM Hasta h WHERE h.idDoktor = :idDoktor")})
public class Hasta implements Serializable {

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
    @Column(name = "ID_DOKTOR")
    private Integer idDoktor;

    public Hasta() {
    }

    public Hasta(Integer id) {
        this.id = id;
    }

    public Hasta(Integer id, String adi, String soyadi) {
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

    public Integer getIdDoktor() {
        return idDoktor;
    }

    public void setIdDoktor(Integer idDoktor) {
        this.idDoktor = idDoktor;
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
        if (!(object instanceof Hasta)) {
            return false;
        }
        Hasta other = (Hasta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bp2_lab10.Hasta[ id=" + id + " ]";
    }

    public static  List<Hasta> GetAllHasta() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BP2_LAB2PU");
        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("SELECT h FROM Hasta h");
        List<Hasta> hastalar = q.getResultList();
        return hastalar;
    }

}
