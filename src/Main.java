public class Main {
    private static String name;

    public static void main(String[] args) {
         Humano myHumano = new Humano("Miguel", 17, 2007, "Sperle", "123-456-789");
         Animal myAnimal = new Animal("Apollo", 4, 2021, "mamifero");
         Calculator myCalculato = new Calculator(30);

        myCalculato.calculatorQuantitySonByMother();
        System.out.println(myCalculato.getCalculatorQuantitySonByMonther());

         System.out.println(myHumano.informacao());
         System.out.println(myAnimal.informacao());


         setName("Miguelitos");
         System.out.println(getName());
    }

    static String setName(String name){ // setter statico ( função inicializadora statica, só aceita método e atributo statico )
        return Main.name = name; // setandno um valor no atributo name na forma statica
    }

    static String getName(){ // getter statico ( função inicializadora statica, só aceita método e atributo statico )
        return Main.name;
    }
}