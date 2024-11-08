package compararstrg;

public class compararstrg {
    public static void main(String[] args) {
    String nome1 = "Gustavo";
    String nome2 = "Gustavo";
    String nome3 = new String("Gustavo");
    String res ;
    res = nome1.equals(nome3)?"Igual":"Diferente";
    System.out.println(res);
    System.out.println(nome2);
}

}
