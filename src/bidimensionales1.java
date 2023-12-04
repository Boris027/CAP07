public class bidimensionales1 {

 
  


  public static void main(String[] args) throws Exception {
  try {
   int tabla[][]=new int[3][6];
    tabla[0][0]=0;
    tabla[0][1]=30;
    tabla[0][2]=2;
    tabla[0][5]=5;
    tabla[1][0]=75;
    tabla[1][4]=0;
    tabla[2][2]=-2;
    tabla[2][3]=9;
    tabla[2][5]=11;

    System.out.printf("Columnas");
    for(int i=0;i<=5;i++){
      System.out.printf("%4d",i);
    }
    System.out.println("");
   for(int i=0;i<=2;i++){
     
    System.out.print(i+" |fila ");
    for(int j=0;j<=5;j++){
      System.out.printf("|%3d",tabla[i][j]);
      if(j==5){
        System.out.print("|");
      }
    }
    System.out.println("");
   }


    } catch (Exception e) {
    System.out.println("Error inesperado");
  }

  
  }
}