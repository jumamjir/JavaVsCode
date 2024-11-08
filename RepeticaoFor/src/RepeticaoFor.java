public class RepeticaoFor {
    public static void main(String[] args)  {

     
     for (int cc = 0; cc<=100; cc+=10){
     System.out.println(cc);
    }
    
    /* 
    int cc = 0;
    while (cc<4){
        System.out.println("Cambalhota");
        cc++;
    } 
    */
    for (int i = 1; i <= 3; i++) {
        for (int j = 0; j <= 2; j += 2) {
            System.out.println("I = " + i + "  ~~~~~~  J = " + j);
            
        }
    }
}


}
