public class ejercicio20 {

  public static int pedirnum(){
    System.out.print("Introduzca el número total de nombres de reyes: ");
    int num=Integer.parseInt(System.console().readLine());
    return num;
  }
    
  public static String pedirey(){
    String rey=System.console().readLine();
    return rey;
  }

  


  public static void main(String[] args) throws Exception {
  try {
    
    int max=pedirnum();
    int lista[]=new int[max];
    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");

    int contador=0;
    String reyes[]=new String[max];
    String reyesfinal[]=new String[max];
    for(int i=0;i<=max-1;i++){
      reyes[i]=pedirey();


      for(int j=0;j<=max-1;j++){
        
        if(reyes[i].equals(reyes[j])){
          contador=contador+1;
          
        }

      }
      reyesfinal[i]=reyes[i] +" "+contador+"º";
      contador=0;
    }



    System.out.println("Los reyes introducidos son: ");
    for(int i=0;i<=max-1;i++){
      System.out.println(reyesfinal[i]);
    }
    } catch (Exception e) {
    System.out.println("Error inesperado");
  }

  
  }
}