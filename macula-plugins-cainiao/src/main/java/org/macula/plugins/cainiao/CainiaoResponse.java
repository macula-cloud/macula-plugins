package org.macula.plugins.cainiao;

import lombok.Data;

@Data
public abstract class CainiaoResponse {

	private boolean success;
	private String errorCode;
	private String errorMsg;

}
