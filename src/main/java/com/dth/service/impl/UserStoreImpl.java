package com.dth.service.impl;

import com.dth.model.UserAccounts;
import com.dth.model.UserSubscriptionChannels;
import com.dth.model.UserSubscriptions;

import java.util.*;

public class UserStoreImpl {

    public UserAccounts createUserAccount(UserAccounts userAccounts) {


        if (Objects.isNull(userAccounts)) {
            userAccounts = new UserAccounts();
        }

        userAccounts.setEmail("test1@dth.com");
        userAccounts.setFirstName("Roy");
        userAccounts.setLastName("Subhasis");
        userAccounts.setPhoneNumber(8995655652L);
        userAccounts.setUserId(1L);

        return userAccounts;
    }

    public UserAccounts updateUser(UserAccounts userAccounts) {

        userAccounts.setEmail(userAccounts.getEmail());
        userAccounts.setPhoneNumber(userAccounts.getPhoneNumber());
        return userAccounts;

    }


    public UserAccounts getUserAccount(Long userId) {

        List<UserAccounts> userAccountsList = prepareUserData();
        UserAccounts userAccounts = userAccountsList.stream().filter(userAccountsData -> userAccountsData.
                equals(userId)).findAny().orElse(null);


        return userAccounts;
    }

    public List<UserAccounts> prepareUserData() {
        UserAccounts userAccounts = null;
        List<UserAccounts> userAccountData = new ArrayList();
        userAccountData.add(createUserAccount(userAccounts));

        return userAccountData;
    }


    public UserSubscriptions getUserSubscriptions(Long userId) {

        UserSubscriptions userSubscriptions = new UserSubscriptions();
        userSubscriptions.setAccountBalance(100.00);
        userSubscriptions.setUserId(1L);
        userSubscriptions.setSubscriptionStatus(true);
        userSubscriptions.setSubscriptionTypeId(1L);
        userSubscriptions.setSubscriptionValidity(3L);
        return userSubscriptions;
    }

    public List<UserSubscriptionChannels> addUserSubscriptionChannels(Long userId, List<Long> channelId) {


        List<UserSubscriptionChannels> userSubscriptionChannelsData = new ArrayList();

        channelId.stream().forEach(channel -> {
            UserSubscriptionChannels userSubscriptionChannels = new UserSubscriptionChannels();
            userSubscriptionChannels.setUserId(userId);
            userSubscriptionChannels.setChannelId(channel);
            userSubscriptionChannelsData.add(userSubscriptionChannels);
        });


        return userSubscriptionChannelsData;
    }


}
