package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie  implements ApplicationContextAware, BeanFactoryAware , BeanNameAware {

     private Actor actor1;
     private Actor actor2;
     private Actor actor3;

     public Movie(Actor actor1,Actor actor2,Actor actor3){
         this.actor1=actor1;
         this.actor2=actor2;
         this.actor3=actor3;
    }
    public Movie(){

    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor1 +
                ", actor2=" + actor2 +
                ", actor3=" + actor3 +
                '}';
    }

    public void setActor(Actor actor) {
        this.actor1 = actor;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware"+applicationContext);

    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware"+ beanFactory);
    }

    public void setBeanName(String s) {
        System.out.println("bean name"+ s);

    }
}
