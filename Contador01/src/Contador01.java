package Contador01.src;

public class Contador01 {
    public static void main(String[] args) {
        int cc = 0;
        while (cc<10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;
            }
            if(cc == 7){
                break;
            }
            System.out.println("Cambalhota " + cc);
            
        }
        System.out.println("Cansei, mo vei ta doidé");
    }
}
