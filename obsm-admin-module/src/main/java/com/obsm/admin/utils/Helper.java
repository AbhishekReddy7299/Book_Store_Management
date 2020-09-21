package com.obsm.admin.utils;

import com.obsm.admin.model.Admin;
import com.obsm.admin.payload.AdminUpdateRequest;

public class Helper {
	public static void copyAdminDetails(Admin admin, AdminUpdateRequest adminRequest) {
        if (adminRequest.getAdminName() != null)
            admin.setAdminName(adminRequest.getAdminName());
        if (adminRequest.getAdminEmail() != null)
            admin.setAdminEmail(adminRequest.getAdminEmail());
        if (adminRequest.getAdminPassword() != null)
            admin.setAdminPassword(adminRequest.getAdminPassword());
    }
}
