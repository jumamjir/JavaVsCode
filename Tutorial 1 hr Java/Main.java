public class Main { 


    public String name;


    protected int salary;

    static String nomeDoVideo= "comecando do zero em java";


    public static void main(String[] args) { 
        Ser meuSerAnimal = new cachorro("Willy",5 ,"Fernanda");
        Ser meuSerHumano = new Pessoa("Fernanda",22 ,"Kipper");
        meuSerAnimal.setnome("Fernanda");
        System.out.println(meuSerAnimal.saudacao());
        System.out.println(meuSerHumano.saudacao());
        System.out.println(nomeDoVideo);
       

    }
    

    private void atualizaSalario(){
        this.salary = 4000;
    }

    public int getSalary(){
        this.atualizaSalario();
        return this.salary;
    }

}








   

