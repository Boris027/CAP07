public class ejercicio5 {

    public static int numero(){
     int numero=Integer.parseInt(System.console().readLine());
     return numero;
    }
    
    public static void main(String[] args) throws Exception {
    
      int lista[]=new int[10];

      for(int i=0;i<=9;i++){
        System.out.printf("Introduzca un numero[%d/10]: ",i+1);
        int numero=numero();
        lista[i]=numero;
      }
      
      int numero=0;
      int max=0;
      int min=0;
      for(int i=0;i<=9;i++){

        if(i==0){
          min=lista[i];
          max=lista[i];
          numero=lista[i];
        }else numero=lista[i];

        if(numero>max){
          max=numero;
        }

        if(numero<min){
          min=numero;
        }
      }

      System.out.println("El numero mas grande es: "+max);
      System.out.println("El numero mas pequeño es: "+min);


    }
}
