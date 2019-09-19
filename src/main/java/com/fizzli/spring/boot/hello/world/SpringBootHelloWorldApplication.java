package com.fizzli.spring.boot.hello.world;

import com.fizzli.spring.boot.hello.world.entity.Phone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@SpringBootApplication
public class SpringBootHelloWorldApplication {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        SpringApplication.run(SpringBootHelloWorldApplication.class, args);

        //反射
        Class clz = Class.forName("com.fizzli.spring.boot.hello.world.entity.Phone");
        Phone phone = (Phone) clz.newInstance();

        Method setNameMethod = clz.getMethod("setName", String.class);
        Object apple = setNameMethod.invoke(phone, "Apple");

        Method getNameMethod = clz.getMethod("getName");
        System.out.println(getNameMethod.invoke(phone));

        Class<Phone> phoneClass = Phone.class;
        Phone phone1 = phoneClass.newInstance();
        Method setName = phoneClass.getMethod("setName", String.class);


    }

}
