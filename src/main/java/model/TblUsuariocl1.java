package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuariocl1 database table.
 * 
 */
@Entity
@Table(name="tbl_usuariocl1")
@NamedQuery(name="TblUsuariocl1.findAll", query="SELECT t FROM TblUsuariocl1 t")
public class TblUsuariocl1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idusuariocl1;

	private String passwordcl1;

	private String usuariocl1;

	public TblUsuariocl1() {
	}

	public int getIdusuariocl1() {
		return this.idusuariocl1;
	}

	public void setIdusuariocl1(int idusuariocl1) {
		this.idusuariocl1 = idusuariocl1;
	}

	public String getPasswordcl1() {
		return this.passwordcl1;
	}

	public void setPasswordcl1(String passwordcl1) {
		this.passwordcl1 = passwordcl1;
	}

	public String getUsuariocl1() {
		return this.usuariocl1;
	}

	public void setUsuariocl1(String usuariocl1) {
		this.usuariocl1 = usuariocl1;
	}

}