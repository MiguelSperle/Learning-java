public class Main {
    public static void main(String[] args) {
         Ser myHumano = new Humano("Miguel", 17, 2007, "Sperle", "123-456-789");
         Ser myAnimal = new Animal("Apollo", 4, 2021, "mamifero");

         System.out.println(myHumano.informacao());
         System.out.println(myAnimal.informacao());

    }
}