public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        int largo=11;
        int[] n;  n=new int [largo];
        n[0]=39;
        n[1]=-2;
        n[4]=0;
        n[6]=14;
        n[8]=5;
        n[9]=120;

        for(int i=1;i<=largo;i++){
            System.out.print("  "+i +"  ");
        }
        System.out.println("");

        for(int i=0;i<=largo-2;i++){
            System.out.print("  "+ n[i] +"  ");
        }

        
    }
}
