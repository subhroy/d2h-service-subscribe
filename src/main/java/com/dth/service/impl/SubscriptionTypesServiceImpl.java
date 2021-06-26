package com.dth.service.impl;

import com.dth.model.SubscriptionTypes;
import com.dth.model.SubscriptionTypesEnum;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionTypesServiceImpl {

   public List<SubscriptionTypes>  getSubscriptionTypes() {
       List<SubscriptionTypes> subscriptionTypesList=new ArrayList();
       SubscriptionTypes subscriptionTypes=new SubscriptionTypes();
       subscriptionTypes.setSubscriptionAmount(500.00);
       subscriptionTypes.setSubscriptionId(1L);
       subscriptionTypes.setSubscriptionType(SubscriptionTypesEnum.SLIVER);

       SubscriptionTypes subscriptionTypes2=new SubscriptionTypes();
       subscriptionTypes2.setSubscriptionAmount(600.00);
       subscriptionTypes2.setSubscriptionId(2L);
       subscriptionTypes2.setSubscriptionType(SubscriptionTypesEnum.GOLD);
       subscriptionTypesList.add(subscriptionTypes);
       subscriptionTypesList.add(subscriptionTypes2);
        return subscriptionTypesList;
    }
}
