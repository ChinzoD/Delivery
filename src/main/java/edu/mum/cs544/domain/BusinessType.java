package edu.mum.cs544.domain;
// Generated Sep 23, 2016 11:52:16 AM by Hibernate Tools 5.1.0.Beta1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * BusinessType generated by hbm2java
 */
@Entity
@Table(name = "business_type", catalog = "food_delivery", uniqueConstraints = @UniqueConstraint(columnNames = "type"))
public class BusinessType implements java.io.Serializable {

	private Integer id;
	private String type;
	private Set<Business> businesses = new HashSet<Business>(0);

	public BusinessType() {
	}

	public BusinessType(String type, Set<Business> businesses) {
		this.type = type;
		this.businesses = businesses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "type", unique = true, length = 200)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "businessType")
	public Set<Business> getBusinesses() {
		return this.businesses;
	}

	public void setBusinesses(Set<Business> businesses) {
		this.businesses = businesses;
	}

}