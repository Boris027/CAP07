public class ejercicio15 {

    public static int random(){
      int random=(int) (Math.random()*5);
      return random;
    }


    public static void main(String[] args) throws Exception {
    try {
      
      int ocupacion[]=new int[10];

      for(int i=0;i<=9;i++){
        ocupacion[i]=random();
      }

      boolean salir=false;

      while(salir!=true){

      
      for(int i=0;i<=9;i++){
        System.out.printf("Mesa nº %d, ocupacion %d%n",i+1,ocupacion[i]);
      }

      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      int numpersonas=Integer.parseInt(System.console().readLine());
      if(numpersonas==-1){
        salir=true;
        System.out.println("Gracias, hasta pronto.");
      }else if(numpersonas<0 || numpersonas>4){
        int uwu=5/0;
      }

      if(salir!=true){
        for(int i=0;i<=9;i++){
        if(ocupacion[i]+numpersonas<=4){
          ocupacion[i]=ocupacion[i]+numpersonas;
          System.out.println("Por favor sientese en la mesa numero: " +(i+1));
          break;
        }

      }

      }
      

      }


      } catch (Exception e) {
      System.out.println("Error inesperado");
    }

    
    }
}
