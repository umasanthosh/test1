package org.codejudge.sb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.codejudge.sb.enums.LocationType;
import org.codejudge.sb.enums.Status;

@Entity
public class Leads {
	
	@Id
	@Column(nullable = false , unique = true)
	private int id;
	
	@Column(nullable = false)
	private String first_name;
	
	@Column(nullable = false)
	private String last_name;
	
	@Column(nullable = false , unique = true , length =10)
	private String mobile;
	
	@Column(nullable = false , unique = true)
	private String email; 
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private LocationType location_type;
	
	@Column(nullable = false)
	private String location_string;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Status status;
	
	@Column(nullable = true) // check with this attribute value -- it should be default null -- so no need for attribute? CHECK!!!
	private String communication;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocationType getLocation_type() {
		return location_type;
	}
	public void setLocation_type(LocationType location_type) {
		this.location_type = location_type;
	}
	public String getLocation_string() {
		return location_string;
	}
	public void setLocation_string(String location_string) {
		this.location_string = location_string;
	}	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getCommunication() {
		return communication;
	}
	public void setCommunication(String communication) {
		this.communication = communication;
	}
	
}
