package com.reviews.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="User")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String name;
	private String emailId;
	private long phoneNumber;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address", referencedColumnName="addressId")
	private Address address;
	

}
