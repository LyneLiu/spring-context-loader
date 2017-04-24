package com.lyne.contextorder.common;

import org.springframework.stereotype.Component;

/**
 * Created by nn_liu on 2017/4/24.
 */
@Component
public class CommonBean {

    private String beanName = "common bean";

    public String getBeanName(){
        return beanName;
    }

}
