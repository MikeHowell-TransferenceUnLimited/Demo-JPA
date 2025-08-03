package com.example.DemoJPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderDetailId implements Serializable {
    public OrderDetailId() {
    }

    @Column(name = "order_id")
    private Short orderId;

    @Column(name = "product_id")
    private Short productId;

    public Short getOrderId() {
        return orderId;
    }

    public void setOrderId(Short orderId) {
        this.orderId = orderId;
    }

    public Short getProductId() {
        return productId;
    }

    public void setProductId(Short productId) {
        this.productId = productId;
    }

    // equals() and hashCode() are required!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDetailId)) return false;

        OrderDetailId that = (OrderDetailId) o;

        return Objects.equals(orderId, that.orderId) &&
                Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId);
    }
}
