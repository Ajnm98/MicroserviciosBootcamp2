public class PersonProxy2 implements PersonInterface{

private final PersonInterface personInterface;

    public PersonProxy2(PersonInterface personInterface){
        this.personInterface = personInterface;

    }

    @Override
    public void mostrarPerson(){
        before();
        personInterface.mostrarPerson();
        after();
    }

    private void before(){
        System.out.println("Ahí viene persona");
    }

    private void after(){
        System.out.println("Adios persona");
    }

}
