public class ejercicio11 {

    public static int pedirnum(){
      int numero=Integer.parseInt(System.console().readLine());
      return numero;
    }


    public static void main(String[] args) throws Exception {
    try {
      int lista[]=new int [10];
      int listaprimos[]= new int[10];
      int listanoprimos[]=new int[10];
      int contadorraro=0;
      int contador=0;
      int contador2=0;
      int contadorlista=0;
      int contadorfinal=0;
      for(int i=0;i<=9;i++){
        System.out.printf("Introduzca un numero [%d/9]: ",i);
        lista[i]=pedirnum();


        for(int j=1;j<=lista[i];j++){

          if(lista[i]%j==0){
            contadorraro=contadorraro+1;
          }
        }

        if(contadorraro==2){
          listaprimos[contador]=lista[i];
          contador=contador+1;
          contadorraro=0;
          contadorlista=contadorlista+1;
        }else {
          contadorraro=0;
          listanoprimos[contador2]=lista[i];
          contador2=contador2+1;
        }
      }

      //array inicial

      for(int i=0;i<=9;i++){
        System.out.printf("%d: %d %n",i, lista[i]);
      }

      for(int w=0;w<=9;w++){
        System.out.print(listaprimos[w] +" ");
      }
      System.out.println("");
      for(int w=0;w<=9;w++){
        System.out.print(listanoprimos[w] +" ");
      }

      for(int i=contadorlista;i<=9;i++){
        listaprimos[i]=listanoprimos[contadorfinal];
        contadorfinal=contadorfinal+1;
      }

      System.out.println("");
      System.out.println("Resultado final: ");
      
      for(int w=0;w<=9;w++){
        System.out.print(listaprimos[w] +" ");
      }

      } catch (Exception e) {
      System.out.println("Error inesperado");
    }

    
    }
}
