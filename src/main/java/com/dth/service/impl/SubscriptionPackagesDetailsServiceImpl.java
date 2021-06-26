package com.dth.service.impl;

import com.dth.model.Channels;
import com.dth.model.SubscriptionMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriptionPackagesDetailsServiceImpl {

    public Map<String, List<SubscriptionMapping>> getSubscriptionPackagesDetails() {


        Map<String, List<SubscriptionMapping>> subscriptionPackagesDetails = new HashMap<>();
        subscriptionPackagesDetails.put("Silver Pack",prepareDataForSilverPackage());
        subscriptionPackagesDetails.put("Gold Pack",prepareDataForGoldPackage());

        return subscriptionPackagesDetails;

    }

    private List<SubscriptionMapping> prepareDataForGoldPackage() {

        {

            List<SubscriptionMapping> subscriptionMappingGold = new ArrayList();
            SubscriptionMapping subscriptionMapping1 = new SubscriptionMapping();

            subscriptionMapping1.setSubscriptionMappingId(4L);
            subscriptionMapping1.setChannelId(1L);
            subscriptionMapping1.setSubscriptionTypeId(2L);

            SubscriptionMapping subscriptionMapping2 = new SubscriptionMapping();
            subscriptionMapping2.setSubscriptionMappingId(5L);
            subscriptionMapping2.setChannelId(2L);
            subscriptionMapping2.setSubscriptionTypeId(2L);

            SubscriptionMapping subscriptionMapping3 = new SubscriptionMapping();
            subscriptionMapping3.setSubscriptionMappingId(6L);
            subscriptionMapping3.setChannelId(3L);
            subscriptionMapping3.setSubscriptionTypeId(2L);

            SubscriptionMapping subscriptionMapping4 = new SubscriptionMapping();
            subscriptionMapping4.setSubscriptionMappingId(7L);
            subscriptionMapping4.setChannelId(4L);
            subscriptionMapping4.setSubscriptionTypeId(2L);

            SubscriptionMapping subscriptionMapping5 = new SubscriptionMapping();
            subscriptionMapping5.setSubscriptionMappingId(7L);
            subscriptionMapping5.setChannelId(5L);
            subscriptionMapping5.setSubscriptionTypeId(2L);

            subscriptionMappingGold.add(subscriptionMapping1);
            subscriptionMappingGold.add(subscriptionMapping2);
            subscriptionMappingGold.add(subscriptionMapping3);
            subscriptionMappingGold.add(subscriptionMapping4);
            subscriptionMappingGold.add(subscriptionMapping5);

            return subscriptionMappingGold;
        }

    }

    public List<SubscriptionMapping> prepareDataForSilverPackage() {

        List<SubscriptionMapping> subscriptionMappingSilver = new ArrayList();
        SubscriptionMapping subscriptionMapping1 = new SubscriptionMapping();
        subscriptionMapping1.setSubscriptionMappingId(1L);
        subscriptionMapping1.setChannelId(1L);
        subscriptionMapping1.setSubscriptionTypeId(1L);
        SubscriptionMapping subscriptionMapping2 = new SubscriptionMapping();
        subscriptionMapping2.setSubscriptionMappingId(2L);
        subscriptionMapping2.setChannelId(2L);
        subscriptionMapping2.setSubscriptionTypeId(1L);
        SubscriptionMapping subscriptionMapping3 = new SubscriptionMapping();
        subscriptionMapping3.setSubscriptionMappingId(3L);
        subscriptionMapping3.setChannelId(3L);
        subscriptionMapping3.setSubscriptionTypeId(1L);
        subscriptionMappingSilver.add(subscriptionMapping1);
        subscriptionMappingSilver.add(subscriptionMapping2);
        subscriptionMappingSilver.add(subscriptionMapping3);

        return subscriptionMappingSilver;
    }

    public List<Channels> getChannelsData() {

        List<Channels> channelsData = new ArrayList();

        Channels channelZee = new Channels();
        channelZee.setChannelAmount(10.00);
        channelZee.setChannelId(1L);
        channelZee.setChannelName("Zee");

        Channels channelSony = new Channels();
        channelSony.setChannelAmount(15.00);
        channelSony.setChannelId(2L);
        channelSony.setChannelName("Sony");

        Channels channelStarPlus = new Channels();
        channelStarPlus.setChannelAmount(20.00);
        channelStarPlus.setChannelId(3L);
        channelStarPlus.setChannelName("Star Plus");

        Channels channelDiscovery = new Channels();
        channelDiscovery.setChannelAmount(10.00);
        channelDiscovery.setChannelId(4L);
        channelDiscovery.setChannelName("Discovery");

        Channels channelNatGeo = new Channels();
        channelNatGeo.setChannelAmount(20.00);
        channelNatGeo.setChannelId(5L);
        channelNatGeo.setChannelName("Nat Geo");

        channelsData.add(channelZee);
        channelsData.add(channelSony);
        channelsData.add(channelStarPlus);
        channelsData.add(channelDiscovery);
        channelsData.add(channelNatGeo);
        return channelsData;


    }
}
