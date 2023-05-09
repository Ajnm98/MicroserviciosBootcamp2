public abstract class person {

    private String name;
    private Integer age;

    public person() {
    }

    public person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public person(person target) {
        if (target != null) {
            this.name = target.name;
            this.age = target.age;
        }
    }

    public abstract person clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof person)) return false;
        person person2 = (person) object2;
        return person2.name == name && person2.age == age;
    }

}
