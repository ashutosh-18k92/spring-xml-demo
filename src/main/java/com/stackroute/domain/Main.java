package com.stackroute.domain;


//import org.springframework.beans.MutablePropertyValues;
//import org.springframework.beans.factory.support.BeanDefinitionReader;
//import org.springframework.beans.factory.support.BeanDefinitionRegistry;
//import org.springframework.beans.factory.support.DefaultListableBeanFactory;
//import org.springframework.beans.factory.support.GenericBeanDefinition;
//import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main{
   public static void main(String[] args) {
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
        Movie myBean = (Movie) beanFactory.getBean("mo");
        System.out.println(myBean);
        ApplicationContext object=new ClassPathXmlApplicationContext("bean.xml");
        Movie second=(Movie) object.getBean("mo");
        System.out.println(second);
        ApplicationContext consObj=new ClassPathXmlApplicationContext("bean.xml");
        Movie third=(Movie) consObj.getBean("cosmo");
        System.out.println(third);
        Movie fourth=(Movie) consObj.getBean("cosmo2");
       System.out.println(fourth);
       System.out.println(third==fourth);

    }
}
