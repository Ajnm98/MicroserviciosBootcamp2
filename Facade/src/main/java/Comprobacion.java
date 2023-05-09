import java.util.Arrays;
import java.util.List;

public class Comprobacion {

    List<Person> personas = Arrays.asList(new Person("Antonio", 25), new Person("Pepe", 22));


   public void checkList(){

       List<Person> personas = Arrays.asList(new Person("Antonio", 25), new Person("Pepe", 22));

       int numero = personas.size();

       System.out.println("Hay " + numero);
   }
}
