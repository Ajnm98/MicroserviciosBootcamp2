

public class person {

    private static person instance;
    private String name;
    private Integer age;



    public static person getInstance() {

        if (instance == null) {

            instance = new person("Antonio", 25);
        }
        return instance;
    }

    public void print(String name, Integer age){
        System.out.println(name +
                "\n" + "es su nombre y" + ++ age +
                "\n" + "su edad");
    }


    private person(String name, Integer age) {

        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
