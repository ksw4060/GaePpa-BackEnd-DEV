package com.sparta.gaeppa.order.dto;


import com.sparta.gaeppa.order.entity.OrderProducts;
import com.sparta.gaeppa.order.entity.Orders;
import java.util.List;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class OrderResponseDto {

    private UUID storeId;
    private AddressDto address;
    private String orderStatus;
    private String orderType;
    private int totalPrice;
    private String orderRequest;
    private List<OrderProducts> orderProductList;

    public static OrderResponseDto from(Orders orders) {
        return OrderResponseDto.builder()
                .storeId(orders.getStore().getStoreId())
                .address(AddressDto.from(orders.getAddress()))
                .orderStatus(orders.getOrderStatus())
                .orderType(orders.getOrderType())
                .totalPrice(orders.getOrderTotalPrice())
                .orderRequest(orders.getOrderRequest())
                .orderProductList(orders.getOrderProductsList())
                .build();
    }
}
