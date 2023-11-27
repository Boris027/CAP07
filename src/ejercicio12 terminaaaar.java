public class ejercicio12 {

    public static int pedirnum(){
      int numero=Integer.parseInt(System.console().readLine());
      return numero;
    }


    public static void main(String[] args) throws Exception {
      int lista[]=new int[10];
      int listafinal[]=new int [10];

      for(int i=0;i<=9;i++){
        System.out.printf("Introduce un numero [%d/10]: ",i+1);
        lista[i]=pedirnum();
      }

      //array inicial

      for(int i=0;i<=9;i++){
        System.out.printf("[%d/10]: %d%n",i+1,lista[i]);
      }

      //posiciones
      System.out.print("Introduzca la posicion inicial: ");
      int posicioninicial=pedirnum();
      System.out.print("Introduzca la posicion final: ");
      int posicionfinal=pedirnum();

      posicionfinal=posicionfinal-1;
      posicioninicial=posicioninicial-1;
      if(posicionfinal>10 || posicionfinal<1 || posicioninicial>10 || posicionfinal<1){
        int exit=5/0;
      }
      
      


      
      

      int listadetras[]=new int[9];
      int contador=0;
      for(int i=posicionfinal;i<=9;i++){
        listadetras[contador]=lista[i];
        //System.out.println(listadetras[contador]);
        contador=contador+1;
      }

      int listadelante[]=new int[9];
      int contadoruwu=0;


      //System.out.println("------------");
      for(int i=0;i<posicionfinal;i++){

        if(i!=posicionfinal && i!=posicioninicial){
          listadelante[i]=lista[i];
        //System.out.println(listadelante[i]);
        }
        
      }


      int grande=9;
      int resultado=grande-posicionfinal;
      //System.out.print(resultado );

      int contadorfinal=0;

      int resultado23[]=new int[10];
      for(int i=0;i<=9;i++){


        if(i==posicionfinal){
          resultado23[posicionfinal]=lista[posicioninicial];
        }

        if(i==9){
          resultado23[0]=lista[i];
        }
        if(i>posicionfinal){
          resultado23[i]=listadetras[contadorfinal];
          contadorfinal=contadorfinal+1;
          
        }

      }
      



      for(int i=1;i<posicionfinal;i++){
        resultado23[i]=lista[i-1];
      }

      System.out.println("------------------");
      for(int i=0;i<=9;i++){
        System.out.print(resultado23[i] +" ");
      }

      
      


      
      


    }
}
