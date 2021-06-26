package com.dth.model;

public class SubscriptionTypes {

    private  Long subscriptionId;
    private SubscriptionTypesEnum subscriptionType;
    private  Double subscriptionAmount;

    public Long getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public SubscriptionTypesEnum getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionTypesEnum subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public Double getSubscriptionAmount() {
        return subscriptionAmount;
    }

    public void setSubscriptionAmount(Double subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount;
    }
}
