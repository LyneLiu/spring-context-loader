package com.lyne.contextorder.controller01;

import com.lyne.contextorder.common.CommonBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nn_liu on 2017/4/21.
 */
@Controller
@RequestMapping("/bowl")
public class Controller01 implements ApplicationContextAware {

    private static ApplicationContext applicationContext; //Spring应用上下文环境

    @Autowired
    private CommonBean commonBean;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    @ResponseBody
    public String home(){
        ApplicationContext context = getApplicationContext();
        System.out.println(context);
        System.out.println(">>>>>>>>>>>>>>"+commonBean.getBeanName());
        return "home page 01";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Controller01.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
