package com.myorg.talenthire.pojo.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

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
@Table(name = "org_candidate")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "cnd_name")
	private String candidateName;

	@Column(name = "cnd_dob")
	private LocalDate candidateDateOfBirth;

	@Column(name = "cnd_gender")
	private String candidateGender;

	@Column(name = "cnd_aadhar")
	private String candidateAadharNo;

	@Column(name = "cnd_contact_no")
	private String candidateContactNo;
	
	@Transient
	private int candidateInterviewId;

	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cnd_interview_id", nullable = true, referencedColumnName = "id")
	private Interview candidateInterview;
}
