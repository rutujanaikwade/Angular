package finzly.spring.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int id;
	String name;
	String emailid;
	String mobileno;
	String status;
	@Temporal(TemporalType.DATE)
	Date createdate;
	@Temporal(TemporalType.DATE)
	Date updatedbydate;
	String createdby;
	String updatedby;
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "fkeyid")
	Country country;
	
	@Column
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	@Column
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	@Column
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
	@Column
	public Date getUpdatedbydate() {
		return updatedbydate;
	}
	public void setUpdatedbydate(Date updatedbydate) {
		this.updatedbydate = updatedbydate;
	}
	
	@Column
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	
	@Column
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public Employee(int id, String name, String emailid, String mobileno, String status, Date createdate,
			Date updatedbydate, String createdby, String updatedby) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.status = status;
		this.createdate = createdate;
		this.updatedbydate = updatedbydate;
		this.createdby = createdby;
		this.updatedby = updatedby;
	}
	
	
	public Employee() {
		super();
		
	}

}
