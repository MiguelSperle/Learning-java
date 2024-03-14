public abstract class Ser {
   private String name; // Atributo privado ( 'boa pratica' )
   private int age; // Atributo privado ( 'boa pratica' )
   private int bornYear; // Atributo privado ( 'boa pratica' )


    public Ser(String name, int age, int bornYear){ // constructor ( vai receber alguns parametros )
        this.name = name;
        this.age = age;
        this.bornYear = bornYear;
    }

    public abstract String informacao(); // método abstract, passa a ser obrigatorio passar esse método em cada subclasse que herda essa classe abstrata

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


