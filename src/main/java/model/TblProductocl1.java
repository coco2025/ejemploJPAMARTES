package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_productocl1 database table.
 * 
 */
@Entity
@Table(name="tbl_productocl1")
@NamedQuery(name="TblProductocl1.findAll", query="SELECT t FROM TblProductocl1 t")
public class TblProductocl1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproductocl1;

	private String descripcioncl1;

	private String estadocl1;

	@Temporal(TemporalType.DATE)
	private Date fechafabricl1;

	@Temporal(TemporalType.DATE)
	private Date fechavencimcl1;

	private String nombrecl1;

	private double preciocl1;

	public TblProductocl1() {
	}

	public int getIdproductocl1() {
		return this.idproductocl1;
	}

	public void setIdproductocl1(int idproductocl1) {
		this.idproductocl1 = idproductocl1;
	}

	public String getDescripcioncl1() {
		return this.descripcioncl1;
	}

	public void setDescripcioncl1(String descripcioncl1) {
		this.descripcioncl1 = descripcioncl1;
	}

	public String getEstadocl1() {
		return this.estadocl1;
	}

	public void setEstadocl1(String estadocl1) {
		this.estadocl1 = estadocl1;
	}

	public Date getFechafabricl1() {
		return this.fechafabricl1;
	}

	public void setFechafabricl1(Date fechafabricl1) {
		this.fechafabricl1 = fechafabricl1;
	}

	public Date getFechavencimcl1() {
		return this.fechavencimcl1;
	}

	public void setFechavencimcl1(Date fechavencimcl1) {
		this.fechavencimcl1 = fechavencimcl1;
	}

	public String getNombrecl1() {
		return this.nombrecl1;
	}

	public void setNombrecl1(String nombrecl1) {
		this.nombrecl1 = nombrecl1;
	}

	public double getPreciocl1() {
		return this.preciocl1;
	}

	public void setPreciocl1(double preciocl1) {
		this.preciocl1 = preciocl1;
	}

}