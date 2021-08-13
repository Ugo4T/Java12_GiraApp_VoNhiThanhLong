package cybersoft.javabackend.java12.gira.role.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import cybersoft.javabackend.java12.gira.role.util.*;

public class CreateProgramDto {
	@NotBlank(message = "{program.name.not-blank}")
	@Size(min=3,max = 50, message="program.name.size")
	private String name;
	private HttpMethods method; //safe type
	private String path;
	public CreateProgramDto() {
		// TODO Auto-generated constructor stub
	}
	public CreateProgramDto(String name,HttpMethods method, String path) {
		this.name = name;
		this.method = method;
		this.path = path;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HttpMethods getMethod() {
		return method;
	}
	public void setMethod(HttpMethods method) {
		this.method = method;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
}