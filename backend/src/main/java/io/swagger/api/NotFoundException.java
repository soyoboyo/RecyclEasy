package io.swagger.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-15T06:02:20.320+02:00")

public class NotFoundException extends ApiException {
	private int code;

	public NotFoundException(int code, String msg) {
		super(code, msg);
		this.code = code;
	}
}
