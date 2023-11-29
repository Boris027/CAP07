public class ejercicio19 {

    public static int random(){
      int aleatorio=(int) (Math.random()*201);
      return aleatorio;
    }


    public static void main(String[] args) throws Exception {
    try {
      int lista[]=new int[12];

      for (int i=0;i<=11;i++){
        lista[i]=random();
      }

      System.out.println("Array inicial: ");
      for (int i=0;i<=11;i++){
        System.out.printf("[%d/12]: %d%n",i+1,lista[i]);
      }

      System.out.print("Introduzca el numero que quiere insertar: ");
      int numero=Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca la posición donde lo quiere insertar (1-12): ");
      int posicion=Integer.parseInt(System.console().readLine());
      posicion=posicion-1;
      int listaprincipio[]=new int[12];

      for(int i=0;i<=posicion-1;i++){
        listaprincipio[i]=lista[i];
      }

      int contador=0;
      int listafinal[]=new int[12];
      for (int i=posicion;i<=10;i++){
        listafinal[contador]=lista[i];
        contador++;
      }

      int contador2=0;
      for(int i=0;i<=11;i++){
        if(listaprincipio[i]!=0){
          lista[i]=listaprincipio[i];
        }else if(i==posicion){
          lista[i]=numero;
        }else if(listafinal[contador2]!=0){
          lista[i]=listafinal[contador2];
          contador2++;
        }
        
      }


      System.out.println("Resultado final: ");
      for (int i=0;i<=11;i++){
        System.out.printf("[%d/12]: %d%n",i+1,lista[i]);
      }
      

      } catch (Exception e) {
      System.out.println("Error inesperado");
    }

    
    }
}
