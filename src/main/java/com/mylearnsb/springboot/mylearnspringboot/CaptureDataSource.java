package com.mylearnsb.springboot.mylearnspringboot;

public class CaptureDataSource {
	private long id;
	private String toolName;
	private String category;
	private String features;
	

	public CaptureDataSource(long id, String toolName, String category, String features) {
		super();
		this.id = id;
		this.toolName = toolName;
		this.category = category;
		this.features = features;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getToolName() {
		return toolName;
	}




	public void setToolName(String toolName) {
		this.toolName = toolName;
	}




	public String getCategory() {
		return category;
	}




	public void setCategory(String category) {
		this.category = category;
	}




	public String getFeatures() {
		return features;
	}




	public void setFeatures(String features) {
		this.features = features;
	}




	@Override
	public String toString() {
		return "CaptureDataSource [id=" + id + ", toolName=" + toolName + ", category=" + category + ", features="
				+ features + "]";
	}
	
	

}
