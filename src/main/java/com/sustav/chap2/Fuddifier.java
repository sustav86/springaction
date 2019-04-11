package com.sustav.chap2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Fuddifier implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Field[] declaredFields = bean.getClass().getDeclaredFields();

        for (int i = 0; i < declaredFields.length; i++) {
            if (declaredFields[i].getType().equals(String.class) && declaredFields[i] != null) {
                declaredFields[i].setAccessible(true);
                try {
                    String field = (String) declaredFields[i].get(bean);
                    String changeField = changeBean(field);
                    declaredFields[i].set(bean, changeField);
                }catch (IllegalAccessException ex) {
                    System.out.println("Wrong field");
                }

            }
        }
        return bean;
    }

    private String changeBean(String declaredField) {
        return declaredField.replaceAll("(r|l)", "w").replaceAll("(R|L)", "W");
    }
}
