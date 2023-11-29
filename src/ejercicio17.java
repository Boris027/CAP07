public class ejercicio17 {

    public static int random(){
      int random=(int) (Math.random()*101);
      return random;
    }


    public static void main(String[] args) throws Exception {
    try {
      
      int lista[]=new int[10];

      for(int i=0;i<=9;i++){
        lista[i]=random();
      }

      for(int i=0;i<=9;i++){
        System.out.print(lista[i] +" ");
      }
      System.out.println("");
      
      boolean salida=false;
      int localizacion=0;
      while(salida==false){

        System.out.print("Introduce un numero del 1 al 100: ");
      int numero=Integer.parseInt(System.console().readLine());
      
      for(int i=0;i<=9;i++){
        if(lista[i]==numero){
          localizacion=i;
          salida=true;
        }
      }
      }

      int listafinal[]=new int[10];
      listafinal[0]=lista[localizacion];

      

      int contador=1;
      System.out.println("Resultado final:");
      for(int i=localizacion+1;i<=9;i++){
        listafinal[contador]=lista[i];
        contador=contador+1;
      }
      for(int i=0;i<=localizacion-1;i++){
        listafinal[contador]=lista[i];
        contador=contador+1;
      }

      for(int i=0;i<=9;i++){
        System.out.print(listafinal[i] +" ");
      }
     

      } catch (Exception e) {
      System.out.println("Error inesperado");
    }

    
    }
}
