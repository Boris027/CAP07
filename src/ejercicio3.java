public class ejercicio3 {

  public static int numero() {
      int numero=Integer.parseInt(System.console().readLine());
      return numero;
  }
    
    public static void main(String[] args) throws Exception {
    
      int lista[] = new int[11];


      for(int i=1;i<=10;i++){
        System.out.print("Introduce un numero ["+i+"/10]: ");
        int numero=numero();
        lista[i]=numero;
      }
      
      for(int i=10;i>=1;i--){
        System.out.print("El numero " +i +" es " +lista[i]);
        System.out.println("");
      }
      
    }
}
