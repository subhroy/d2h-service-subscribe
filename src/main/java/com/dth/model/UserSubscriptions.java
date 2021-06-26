package com.dth.model;

public class UserSubscriptions {

    private Long userId;
    private Double accountBalance;
    private Boolean  subscriptionStatus;
    private Long subscriptionTypeId;
    private Long subscriptionValidity;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Boolean getSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setSubscriptionStatus(Boolean subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    public Long getSubscriptionTypeId() {
        return subscriptionTypeId;
    }

    public void setSubscriptionTypeId(Long subscriptionTypeId) {
        this.subscriptionTypeId = subscriptionTypeId;
    }

    public Long getSubscriptionValidity() {
        return subscriptionValidity;
    }

    public void setSubscriptionValidity(Long subscriptionValidity) {
        this.subscriptionValidity = subscriptionValidity;
    }
}
