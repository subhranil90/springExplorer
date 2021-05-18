package com.myorg.talenthire.pojo.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "org_interview")
public class Interview {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "interview_date")
	private LocalDate interviewDate;

	@Column(name = "interview_slot")
	private String interviewSlot;

	@Column(name = "interview_status")
	private String interviewStatus;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "interview_project_id", nullable = true)
	private Project interviewProject;

	@JsonIgnore
	@OneToOne(mappedBy = "candidateInterview", cascade = CascadeType.ALL, orphanRemoval = true)
	@Transient
	private Candidate candidate;
}
