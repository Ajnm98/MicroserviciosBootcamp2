package com.example.retobootcampmicro2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]){

        Person person2 = Person.builder().age(15).name("Gustavo").build();
        System.out.println(person2.getName() + " es su nombre en Builder");
        System.out.println(person2.getAge() + " es su edad en Builder");


        PersonConfigurable person = new PersonConfigurable();

        System.out.println(person.personSinglenton().getName() + " es su nombre en Singlenton");
        System.out.println(person.personSinglenton().getAge() + " es su edad en Singlenton");
        System.out.println(person.personPrototype().getName() + " es su nombre en Prototype");
        System.out.println(person.personPrototype().getAge() + " es su nombre en Prototype");



}

}
