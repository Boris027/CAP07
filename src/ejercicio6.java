public class ejercicio6 {

    public static int numero(){
      int numero=Integer.parseInt(System.console().readLine());
      return numero;
    }
    
    public static void main(String[] args) throws Exception {
    int lista1[]=new int[15];
    int lista2[]=new int[15];

    for(int i=0;i<=14;i++){
      System.out.printf("Introduce un numero[%d/15]: ",i+1);
      int numero=numero();

      lista1[i]=numero;
    }
    System.out.println("La lista normal es:");
    for(int i=1;i<=15;i++){
      System.out.print(lista1[i-1] +" ");
    }

    for(int i=0;i<=14;i++){

      if(i==14){
        lista2[0]=lista1[14];
      }else lista2[i+1]=lista1[i];

    }
    System.out.println("");
    System.out.println("La lista rara es:");

    for(int i=0;i<=14;i++){

      System.out.print(lista2[i]+ " ");
    }

    



    }
}
