package com.kishore.springcloud.profiles;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class ApiResource {
	private String appName;
	private String activeProfile;
	private String serverHostName;
	private String serverPort;
}
