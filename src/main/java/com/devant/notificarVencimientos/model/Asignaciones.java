package com.devant.notificarVencimientos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "assignments")
public class Asignaciones {
	
	@Id
	private String id;

	private String userId;
	
	private String physicalExpirationDate;
	
	private String logicalExpirationDate;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPhysicalExpirationDate() {
		return physicalExpirationDate;
	}

	public void setPhysicalExpirationDate(String physicalExpirationDate) {
		this.physicalExpirationDate = physicalExpirationDate;
	}

	public String getLogicalExpirationDate() {
		return logicalExpirationDate;
	}

	public void setLogicalExpirationDate(String logicalExpirationDate) {
		this.logicalExpirationDate = logicalExpirationDate;
	}
	
	

}
