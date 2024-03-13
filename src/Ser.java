public class Ser {
   private String name; // Atributo privado ( 'boa pratica' )
   private int age; // Atributo privado ( 'boa pratica' )
   private int bornYear; // Atributo privado ( 'boa pratica' )


    public Ser(String name, int age, int bornYear){ // constructor ( vai receber alguns parametros )
        this.name = name;
        this.age = age;
        this.bornYear = bornYear;
    }

    public String informacao(){
        // Polimorfismo, objetos de classes diferente vao responder essa mensagem de forma diferente( vão mostrar a info aqui de formas diferentes )
        return null;
    }

    public int getBornYear(){ // Pelo getter, estou pegando esse atributo
        return bornYear;
    }

    public int getAge(){ // Pelo getter, estou pegando esse atributo
        return age;
    }

    public String getName(){ // Pelo getter, estou pegando esse atributo
        return name;
    }
}


