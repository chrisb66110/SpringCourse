package com.projectone.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//Los metodos de esta clase se ejecutan desde la carga del xml por cada bean en el xml
public class ExampleBeanPostProcessor implements BeanPostProcessor{
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("ExampleBeanPostProcessor: Antes de la Inicialización del bean " + bean.getClass() + ": " + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("ExampleBeanPostProcessor: Después de la Inicialización del bean " + bean.getClass() + ": " + beanName);
		return bean;
	}
	
}
