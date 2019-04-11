package com.sustav.springinaction;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BraveKnight implements Knight, BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean {

    private Quest quest;
//    private Minstrel minstrel;

//    public BraveKnight(Quest quest, Minstrel minstrel) {
//        this.quest = quest;
//        this.minstrel = minstrel;
//    }

    public BraveKnight(Quest quest) {
        System.out.println("Constructor WITH params");
        this.quest = quest;
    }

    public BraveKnight() {
        System.out.println("Constructor without params");
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("1. BeanNameAware setBeanName() " + name);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("3. ApplicationContextAware setApplicationContext() " + applicationContext.getDisplayName());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("4. InitializingBean afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("8. DisposableBean destroy()");
    }

    public void init() {
        System.out.println("5. init()");
    }

    public void destroed() {
        System.out.println("9. destroed()");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("2. BeanFactoryAware setBeanFactory() " + beanFactory.toString());
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("6. BeanPostProcessor postProcessBeforeInitialization()");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("7. BeanPostProcessor postProcessAfterInitialization()");
        return bean;
    }
}
