public class ejercicio10 {

    public static int aleatorio(){
      int aleatorio=(int) (Math.random()*101);
      return aleatorio;
    }
    public static void main(String[] args) throws Exception {
    try {
      int lista1[]=new int[20];
      int listapares[]=new int [20];
      int listaimpares[]=new int[20];
      for(int i=0;i<=19;i++){
        lista1[i]=aleatorio();
      }
      
      int contador=0;
      int contadorimpar=0;
      System.out.print("La lista inicial: ");
      for(int i=0;i<=19;i++){
        if(lista1[i]%2==0){
          listapares[contador]=lista1[i];
          contador=contador+1;
        }else if(lista1[i]%2!=0){
          listaimpares[contadorimpar]=lista1[i];
          contadorimpar=contadorimpar+1;
        }
        System.out.print(lista1[i] +" ");
      }
      

      System.out.println("");
      System.out.print("La lista de los numeros pares: ");
      for(int i=0;i<=contador-1;i++){
        System.out.print(listapares[i] +" ");
      }

      System.out.println("");
      System.out.print("La lista de los numeros impares: ");
      for(int i=0;i<=contadorimpar-1;i++){
        System.out.print(listaimpares[i] +" ");
      }

      System.out.println("");

      int contadoruwu=0;
      System.out.print("La lista con pares al principio e impares detras: ");
      for(int i=contador;i<=19;i++){
        listapares[i]=listaimpares[contadoruwu];
        contadoruwu=contadoruwu+1;
      }
      for(int i=0;i<=19;i++){
        System.out.print(listapares[i] +" ");
      }


      } catch (Exception e) {
      System.out.println("Error inesperado");
    }

    
    }
}
