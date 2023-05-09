import java.util.List;

public class Main {

    public static void main(String[] args) {
        person person1 = new person() {
            @Override
            public person clone() {
                return null;
            }
        };

        person person2 = person1;
        System.out.println(person2);


    }
}
