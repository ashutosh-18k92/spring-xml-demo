package com.stackroute.domain;


import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
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
        BeanDefinitionRegistry beanDefinitionRegistry=(BeanDefinitionRegistry) object.getAutowireCapableBeanFactory();
        GenericBeanDefinition definition=new GenericBeanDefinition();

        definition.setBeanClass(Movie.class);

        definition.setAutowireCandidate(true);

        MutablePropertyValues mutablePropertyValues=new MutablePropertyValues();

        beanDefinitionRegistry.registerBeanDefinition("mo",definition);

        Movie movie1= (Movie)beanFactory.getBean("mo");

        System.out.println(movie1);

        DefaultListableBeanFactory beanFactoryy = new DefaultListableBeanFactory();

        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactoryy);

        reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/bean.xml"));

        Movie movie3=(Movie)beanFactory.getBean("mo");

        System.out.println(movie3);
    }
}
