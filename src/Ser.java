public class Ser {
    String name;
    int age;
    int bornYear;



    public Ser(String name, int age, int bornYear){ // constructor ( vai receber alguns parametros )
        this.name = name;
        this.age = age;
        this.bornYear = bornYear;
    }

    public String informacao(){
        // Polimorfismo, objetos de classes diferente vao responder essa mensagem de forma diferente( vão mostrar a info aqui de formas diferentes )
        return null;
    }
}


