package com.obsm.admin.payload;

public class AdminUpdateRequest {
	private String adminName;
	private String adminEmail;
	private String adminPassword;
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public AdminUpdateRequest() {
	}
	@Override
	public String toString() {
		return "AdminUpdateRequest [adminName=" + adminName + ", adminEmail=" + adminEmail + ", adminPassword="
				+ adminPassword + "]";
	}
}
