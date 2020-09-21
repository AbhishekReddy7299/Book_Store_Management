package com.obsm.cart.utils;

import com.obsm.cart.model.Admin;
import com.obsm.cart.model.CustomerCart;
import com.obsm.cart.payload.CartUpdateRequest;

public class Helper {
	public static void copyAdminDetails(Admin admin, CartUpdateRequest adminRequest) {
        if (adminRequest.getAdminName() != null)
            admin.setAdminName(adminRequest.getAdminName());
        if (adminRequest.getAdminEmail() != null)
            admin.setAdminEmail(adminRequest.getAdminEmail());
        if (adminRequest.getAdminPassword() != null)
            admin.setAdminPassword(adminRequest.getAdminPassword());
    }

	public static void copyCartDetails(CustomerCart updatedCart, CartUpdateRequest cartUpdateRequest) {
		// TODO Auto-generated method stub
		
	}
}
