public class ejercicio16 {

    public static int random(){
      int random=(int) (Math.random()*401);
      return random;
    }


    public static void main(String[] args) throws Exception {
    try {
      
     int lista[]=new int[20];

     for(int i=0;i<=19;i++){
      lista[i]=random();
     }


    for(int i=0;i<=19;i++){
      System.out.print(lista[i]+" ");
     }

     System.out.println("");
     System.out.print("¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
     int numero=Integer.parseInt(System.console().readLine());
     if(numero>2 || numero<1){System.out.println("Introduzca numeros del 1-2");int numeroxd=5/0; }

     if(numero==1){
      numero=5;
     }else if(numero==2){
      numero=7;
     }

     for(int i=0;i<=19;i++){
      if(lista[i]%numero==0){
        System.out.print("["+lista[i]+"] ");
      }else System.out.print(lista[i]+" ");
     }
     

      } catch (Exception e) {
      System.out.println("Error inesperado");
    }

    
    }
}
