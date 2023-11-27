public class ejercicio1 {
    public static void main(String[] args) throws Exception {
       
        int[] largo=new int[12];

        largo[0]=39;
        largo[1]=-2;
        largo[4]=0;
        largo[6]=14;
        largo[8]=5;
        largo[9]=120;

        for(int i=0;i<=11;i++){
            System.out.printf("num[%d]=%d%n",i,largo[i]);
        }
        
    }
}
