// FoodRequestDTO.java
package com.greengrub.mcp_server.dto;

public class FoodRequestDTO {

    private String foodName;
    private Integer quantity;
    private String requestedBy;
    private String status;

    public FoodRequestDTO() {}

    public FoodRequestDTO(String foodName, Integer quantity, String requestedBy, String status) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.requestedBy = requestedBy;
        this.status = status;
    }

    public String getFoodName() { return foodName; }
    public void setFoodName(String foodName) { this.foodName = foodName; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public String getRequestedBy() { return requestedBy; }
    public void setRequestedBy(String requestedBy) { this.requestedBy = requestedBy; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}