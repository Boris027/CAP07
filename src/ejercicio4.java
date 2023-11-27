public class ejercicio4 {

    public static int aleatorio(){

      int random=(int) (Math.random()*100 +1);
      return random;
    }
    
    public static void main(String[] args) throws Exception {
    
      int normal[] =new int[21];
      int cuadrado[] =new int[21];
      int cubo[] =new int[21];

      for(int i=1;i<=20;i++){
        int random=aleatorio();
        normal[i]=random;
        cuadrado[i]=random*random;
        cubo[i]=random*random*random;
      }
      System.out.printf("%10s %s %s%n","Normal","Cuadrado","Cubo");

      for(int i=0;i<=20;i++){
        if(i==0){
          System.out.print("");
        }else System.out.printf("[%d] %4d %7d %7d%n",i,normal[i],cuadrado[i],cubo[i]);
      }
      
    }
}
