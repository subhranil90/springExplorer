package com.myorg.talenthire.pojo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "org_hr_portal_cred")
public class HRPortalCredential {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "hr_portal_name")
	private String hrPortalName;

	@Column(name = "hr_portal_username")
	private String hrPortalUsername;

	@Column(name = "hr_portal_password")
	private String hrPortalPassword;

	@Column(name = "hr_portal_userrole")
	private String hrPortalUserrole;
}
