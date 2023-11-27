public class ejercicio13 {

    public static int random(){

      int random=(int) (Math.random()*501);
      return random;
    }


    public static void main(String[] args) throws Exception {
    try {
      
      int lista[]=new int[100];

      for(int i=0;i<=99;i++){
        lista[i]=random();
      }



      int contador=0;
      for(int i=0;i<=99;i++){
        System.out.print(lista[i]+" ");
        
        if(contador==21){
          System.out.println("");
          contador=0;
        }
        contador=contador+1;
      }

      System.out.println("");
      System.out.print("Que quiere destacar (1.max/2.min): ");
      int num=Integer.parseInt(System.console().readLine());

      ///////////////////////////////
      int max=0;
      int min=0;
      int minlinea=0;
      int maxlinea=0;
      for(int i=0;i<=99;i++){
        if(i==0){
          min=lista[i];
          max=lista[i];
        }
        if(lista[i]>max){
          max=lista[i];
          maxlinea=i;
        }
        if(lista[i]<min){
          min=lista[i];
          minlinea=i;
        }
      }
        ////////////////////////////////

      contador=0;
      for(int i=0;i<=99;i++){
        if(num==1 && i==maxlinea){
          System.out.print("**"+lista[i]+"**"+" ");
        }else if(num==2 && i==minlinea){
          System.out.print("**"+lista[i]+"**"+" ");
        }else System.out.print(lista[i]+" ");
        
        if(contador==21){
          System.out.println("");
          contador=0;
        }
        contador=contador+1;
      }

        


      } catch (Exception e) {
      System.out.println("Error inesperado");
    }

    
    }
}
