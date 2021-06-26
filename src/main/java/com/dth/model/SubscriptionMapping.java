package com.dth.model;

public class SubscriptionMapping {

    private Long SubscriptionMappingId;
    private Long subscriptionTypeId;
    private Long channelId;

    public Long getSubscriptionMappingId() {
        return SubscriptionMappingId;
    }

    public void setSubscriptionMappingId(Long subscriptionMappingId) {
        SubscriptionMappingId = subscriptionMappingId;
    }

    public Long getSubscriptionTypeId() {
        return subscriptionTypeId;
    }

    public void setSubscriptionTypeId(Long subscriptionTypeId) {
        this.subscriptionTypeId = subscriptionTypeId;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }
}
