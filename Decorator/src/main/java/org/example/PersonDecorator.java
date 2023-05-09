package org.example;

public abstract class PersonDecorator implements Decorator {
    private Decorator person;
    private Integer age;

    public PersonDecorator(Decorator person, Integer age) {
        this.person = person;
        this.age = age;
    }

    public Decorator getPerson() {
        return person;
    }

    public void setPerson(Decorator person) {
        this.person = person;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


