package com.spring_cloud.eureka.client.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ProductClient productClient;

    public String getProductInfo(String productId) {
        return productClient.getProduct(productId);
    }

    public String getOrderInfo(String orderId) {
        if (orderId.equals("1")) {
            String productId = "2";
            String productInfo = getProductInfo(productId);
            return "Your Order is " + orderId + " and " + productInfo;
        }
        return "Not Exist Order";
    }
}
