package testprojects.restassured.spaceflight.POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Launch {
	
	private String launchId;
	private String provider;
	
	public String getLaunchId() {
		return launchId;
	}
	public void setLaunchId(String launchId) {
		this.launchId = launchId;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}

}
