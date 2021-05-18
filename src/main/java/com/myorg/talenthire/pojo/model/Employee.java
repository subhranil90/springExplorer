package com.myorg.talenthire.pojo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "org_employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "emp_name")
	private String empName;

	@Column(name = "emp_designation")
	private String empDesignation;

	@Column(name = "emp_contact_no")
	private String empContactNo;

	@Column(name = "emp_doj")
	private String empDateOfJoining;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "emp_department_id", nullable = false)
	private Department empDepartment;
}
