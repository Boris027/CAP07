public class ejercicio18 {

    public static int random(){
      int aleatorio=(int) (Math.random()*201);
      return aleatorio;
    }


    public static void main(String[] args) throws Exception {
    try {
      int lista[]=new int[10];
      int menorigual100[]=new int[10];
      int mayorigual100[]=new int[10];

      for(int i=0;i<=9;i++){
        lista[i]=random();
      }
      System.out.println("Resultado inicial: ");
      for(int i=0;i<=9;i++){
        System.out.printf("[%d/10]: %d%n",i+1,lista[i]);
      }

      int contador=0;
      int contador2=0;
      for(int i=0;i<=9;i++){
        if(lista[i]<=100){
          menorigual100[contador]=lista[i];
          contador++;
        }else{
          mayorigual100[contador2]=lista[i];
          contador2++;
        } 
      }
      
      boolean resultado=false;
      int contadorfinal=0;
      for(int i=0;i<=9;i++){
        if(menorigual100[i]!=0){
          lista[contadorfinal]=menorigual100[i];
          contadorfinal++;
        }

        if(mayorigual100[i]!=0){
          lista[contadorfinal]=mayorigual100[i];
          contadorfinal++;
        }
      }
      

      System.out.println("Resultado final: ");
      for(int i=0;i<=9;i++){
        System.out.printf("[%d/10]: %d%n",i+1,lista[i]);
      }

      } catch (Exception e) {
      System.out.println("Error inesperado");
    }

    
    }
}
