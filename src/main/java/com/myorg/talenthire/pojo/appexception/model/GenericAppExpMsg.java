package com.myorg.talenthire.pojo.appexception.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class GenericAppExpMsg {
	private String errorServiceName;
	private String errorMessage;
	private String errorTimeStamp;
}
