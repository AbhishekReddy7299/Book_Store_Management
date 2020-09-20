package com.obsm.customer.utils;

import com.obsm.customer.model.Customer;
import com.obsm.customer.payload.CustomerUpdateRequest;

public class Helper {
	public static void copyCustomerDetails(Customer customer, CustomerUpdateRequest customerRequest) {
        if (customerRequest.getCustomerName() != null)
            customer.setCustomerName(customerRequest.getCustomerName());
        if (customerRequest.getCustomerEmail() != null)
            customer.setCustomerEmail(customerRequest.getCustomerEmail());
        if (customerRequest.getCustomerPassword() != null)
            customer.setCustomerPassword(customerRequest.getCustomerPassword());
        if (customerRequest.getPhoneNumber() != 0)
            customer.setPhoneNumber(customerRequest.getPhoneNumber());
        if (customerRequest.getAddress() != null)
            customer.setAddress(customerRequest.getAddress());
        if (customerRequest.getCity() != null)
            customer.setCity(customerRequest.getCity());
        if (customerRequest.getZipCode() != null)
            customer.setZipCode(customerRequest.getZipCode());
        if (customerRequest.getCountry() != null)
            customer.setCountry(customerRequest.getCountry());
    }

}
