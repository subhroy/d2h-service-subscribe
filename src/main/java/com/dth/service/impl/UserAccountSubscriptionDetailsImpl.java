package com.dth.service.impl;

import com.dth.model.UserAccounts;
import com.dth.model.UserSubscriptions;

public class UserAccountSubscriptionDetailsImpl  {


    public UserSubscriptions getUserAccountSubscriptionDetails() {

        UserStoreImpl  userStore=new UserStoreImpl();
        UserAccounts userAccounts=new UserAccounts();
        userAccounts= userStore.createUserAccount(userAccounts);
        UserSubscriptions userSubscriptions=userStore.getUserSubscriptions(userAccounts.getUserId());
        return userSubscriptions;
    }

    public UserSubscriptions userAccountSubscriptionRecharge(Long userId,Double amount) {

        UserStoreImpl  userStore=new UserStoreImpl();
        UserAccounts userAccounts=new UserAccounts();
        userAccounts= userStore.getUserAccount(userId);
        UserSubscriptions userSubscriptions=userStore.getUserSubscriptions(userId);
        userSubscriptions.setAccountBalance(userSubscriptions.getAccountBalance()+amount);
        return userSubscriptions;
    }


}
