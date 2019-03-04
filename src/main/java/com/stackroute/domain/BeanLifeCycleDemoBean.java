package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean , DisposableBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("The bean building started");
    }

    public void destroy() throws Exception {
        System.out.println("The Bean is going to be disposed");
    }
    public void customInIt() {
        System.out.println("Starting Bean");
    }
    public void customDestroy(){
        System.out.println("Destoryed");
    }
}
