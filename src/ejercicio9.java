public class ejercicio9 {

    public static int pedirnum(){
      int numero=Integer.parseInt(System.console().readLine());
      return numero;
    }
    public static void main(String[] args) throws Exception {
    try {
      
    
      int lista[]= new int [8];

      for(int i=0;i<=7;i++){
        System.out.printf("Introduce un numero[%d/8]: ",i+1);
        int numero=pedirnum();
        lista[i]=numero;
      }
      String resultado="";
      for(int i=0;i<=7;i++){
        if(lista[i]%2==0){
          resultado="par";
        }else resultado="impar";
        System.out.printf("[%d/8] %d es %s%n",i+1,lista[i],resultado);
      }

      } catch (Exception e) {
      System.out.println("Error inesperado");
    }

    
    }
}
