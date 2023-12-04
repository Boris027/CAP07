public class bidimensionales4 {

 
  public static int pedirnum(){
    System.out.print("Introduzca un numero: ");
    int numero=Integer.parseInt(System.console().readLine());
    return numero;
  }

  public static int random(){
    int random=(int) (Math.random()*900 +100);
    return random;
  }


  public static void main(String[] args) throws Exception {
  try {
   
    int lista[][]=new int[4][5];


    for(int i=0;i<=3;i++){
      for(int j=0;j<=4;j++){
        lista[i][j]=random();
      }
    }

    int sumalocal=0;
    int sumageneral=0;
    for(int i=0;i<=3;i++){


      for(int j=0;j<=4;j++){
        
        System.out.printf("%-4d",lista[i][j]);
        sumalocal=sumalocal+lista[i][j];
        sumageneral=sumageneral+lista[i][j];
      }
      Thread.sleep(1000);
      System.out.print(" "+sumalocal);
      sumalocal=0;
      System.out.println("");
    }

    for(int i=0;i<=4;i++){
      System.out.printf("%-4d",i);
    }

    Thread.sleep(1000);
    System.out.print(" "+sumageneral);
    
    } catch (Exception e) {
    System.out.println("Error inesperado");
  }

  
  }
}