package com.dth.model;

public class UserSubscriptionChannels {

    private Long userId;
    private Long channelId;

    public Long getUserId() {
        return userId;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;



    }
}
