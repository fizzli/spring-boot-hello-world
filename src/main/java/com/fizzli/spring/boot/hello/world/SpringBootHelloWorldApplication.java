package com.fizzli.spring.boot.hello.world;

import com.fizzli.spring.boot.hello.world.entity.Phone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        SpringApplication.run(SpringBootHelloWorldApplication.class, args);

        Class clz = Class.forName("com.fizzli.spring.boot.hello.world.entity.Phone");
        Phone phone = (Phone) clz.newInstance();

        Method setNameMethod = clz.getMethod("setName", String.class);
        Object apple = setNameMethod.invoke(phone, "Apple");

        Method getNameMethod = clz.getMethod("getName");
        System.out.println(getNameMethod.invoke(phone));


    }

}
