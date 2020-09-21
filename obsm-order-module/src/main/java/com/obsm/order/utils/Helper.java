package com.obsm.order.utils;

import com.obsm.order.model.Order;
import com.obsm.order.payload.OrderUpdateRequest;

public class Helper {
	public static void copyOrderDetails(Order order, OrderUpdateRequest orderRequest) {
        if (orderRequest.getRecipientName() != null)
            order.setRecipientName(orderRequest.getRecipientName());
        if (orderRequest.getPhoneNumber() != 0)
            order.setPhoneNumber(orderRequest.getPhoneNumber());
        if (orderRequest.getAddress() != null)
            order.setAddress(orderRequest.getAddress());
        if (orderRequest.getCity() != null)
            order.setCity(orderRequest.getCity());
        if (orderRequest.getZipCode() != null)
            order.setZipCode(orderRequest.getZipCode());
        if (orderRequest.getCountry() != null)
            order.setCountry(orderRequest.getCountry());
        if (orderRequest.getOrderStatus() != null)
            order.setOrderStatus(orderRequest.getOrderStatus());
	}

}