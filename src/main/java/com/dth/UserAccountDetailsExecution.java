package com.dth;

import com.dth.model.*;
import com.dth.service.impl.SubscriptionPackagesDetailsServiceImpl;
import com.dth.service.impl.SubscriptionTypesServiceImpl;
import com.dth.service.impl.UserAccountSubscriptionDetailsImpl;
import com.dth.service.impl.UserStoreImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserAccountDetailsExecution {

    public static void main(String[] args) {
        SubscriptionTypesServiceImpl subscriptionTypesServiceImpl = new SubscriptionTypesServiceImpl();
        UserAccountDetailsExecution userAccountDetailsTest = new UserAccountDetailsExecution();
        userAccountDetailsTest.getUserAccountSubscriptionDetails(subscriptionTypesServiceImpl);
    }

    public void getUserAccountSubscriptionDetails(SubscriptionTypesServiceImpl subscriptionTypesServiceImpl) {


        UserAccountSubscriptionDetailsImpl userAccountSubscriptionDetails = new UserAccountSubscriptionDetailsImpl();
        UserSubscriptions userSubscriptions = userAccountSubscriptionDetails.getUserAccountSubscriptionDetails();
        System.out.println("Account balance is " + userSubscriptions.getAccountBalance() + " Rs");

        SubscriptionTypes subscriptionTypesData = subscriptionTypesServiceImpl.getSubscriptionTypes(
        ).stream().filter(subscriptionTypes -> userSubscriptions.getSubscriptionTypeId().equals(subscriptionTypes.getSubscriptionId())
        ).findAny().orElse(null);
        System.out.println("Current subscription: " + subscriptionTypesData.getSubscriptionType().name());
        userAccountRecharge(userAccountSubscriptionDetails);
    }

    public void userAccountRecharge(UserAccountSubscriptionDetailsImpl userAccountSubscriptionDetails) {

        UserSubscriptions userSubscriptions = userAccountSubscriptionDetails.userAccountSubscriptionRecharge
                (1L, 700.00);
        System.out.println("Recharge completed successfully. Current balance is  " + userSubscriptions.getAccountBalance() + " Rs");

        subscriptionPacksAndchannelsData();
    }


    public void subscriptionPacksAndchannelsData() {

        SubscriptionPackagesDetailsServiceImpl subscriptionPackagesDetailsServiceImpl = new SubscriptionPackagesDetailsServiceImpl();
        Map<String, List<SubscriptionMapping>> subscriptionPackagesDetails = subscriptionPackagesDetailsServiceImpl.getSubscriptionPackagesDetails();

        System.out.println("Available packs for subscription  ");

        System.out.println("Silver Pack :" + " \n");
        subscriptionPackagesDetails.get("Silver Pack").
                stream().forEach(subscriptionMapping -> {
                    Channels channels = getChannel(subscriptionMapping, subscriptionPackagesDetailsServiceImpl);
                    System.out.println(channels.getChannelName());
                }
        );

        System.out.println("Gold Pack :" + " \n");

        subscriptionPackagesDetails.get("Gold Pack").
                stream().forEach(subscriptionMapping -> {
                    Channels channels = getChannel(subscriptionMapping, subscriptionPackagesDetailsServiceImpl);
                    System.out.println(channels.getChannelName());
                }
        );

        List<Channels> channelsData = subscriptionPackagesDetailsServiceImpl.getChannelsData();

        System.out.println("Available channels for subscription :" + " \n");
        channelsData.stream().forEach(channel -> {
            System.out.println(channel.getChannelName() + ": " + channel.getChannelAmount() + "Rs,");
        });

        addUserSubscriptionChannels();
        userAccountUpdate();

    }

    public void userAccountUpdate() {

        UserStoreImpl userStoreImpl = new UserStoreImpl();
        System.out.println("Update email and phone number for notifications");

        UserAccounts userAccounts = new UserAccounts();
        userAccounts.setEmail("test799@dth.com");
        userAccounts.setPhoneNumber(99898987698L);
        userStoreImpl.updateUser(userAccounts);
        System.out.println("Email and Phone updated successfully.");


    }

    public void addUserSubscriptionChannels() {

        UserStoreImpl userStoreImpl = new UserStoreImpl();

        List<Long> channels = new ArrayList();
        channels.add(getChannelIdByName("Discovery"));
        channels.add(getChannelIdByName("Nat Geo"));
               userStoreImpl.addUserSubscriptionChannels(1L, channels);
        System.out.println("Channels added successfully.");


    }

    public Long  getChannelIdByName(String channelName){

        SubscriptionPackagesDetailsServiceImpl subscriptionPackagesDetailsServiceImpl=new SubscriptionPackagesDetailsServiceImpl();


        List<Channels> channelsData = subscriptionPackagesDetailsServiceImpl.getChannelsData();
        Channels channels = channelsData.stream().filter(data -> {
            return data.getChannelName().equalsIgnoreCase(channelName);
        }).findAny().orElse(null);

        return channels.getChannelId();


    }


    Channels getChannel(SubscriptionMapping subscriptionMapping, SubscriptionPackagesDetailsServiceImpl
            subscriptionPackagesDetailsServiceImpl) {

        List<Channels> channelsData = subscriptionPackagesDetailsServiceImpl.getChannelsData();

        Channels channels = channelsData.stream().filter(data -> {
            return data.getChannelId().equals(subscriptionMapping.getChannelId());
        }).findAny().orElse(null);

        return channels;
    }


}
