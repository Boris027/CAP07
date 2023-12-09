public class bidimensionales13 {

 public static int random(){

  int random=(int)(Math.random()*71 +140);
  return random;
 }

  public static void main(String[] args) throws Exception {
  try {

    int lista[][]=new int[4][10];

    String paises[]=new String[4];
    paises[0]="España";
    paises[1]="Rusia";
    paises[2]="Japón";
    paises[3]="Australia";

    for(int i=0;i<=3;i++){

      for(int j=0;j<=9;j++){
        lista[i][j]=random();
      }
    }


    System.out.printf("%-52s MED MIN MAX%n","");

    int max=0;
    int min=0;
    int media=0;

    for(int i=0;i<=3;i++){

      System.out.printf("%9s: ",paises[i]);
      for(int j=0;j<=9;j++){

        System.out.print(lista[i][j] +" ");

        if(j==0){
          max=lista[i][j];
          min=lista[i][j];
        }

        if(lista[i][j]>max){
          max=lista[i][j];
        }

        if(lista[i][j]<min){
          min=lista[i][j];
        }

        media=media+lista[i][j];

        if(j==9){
          System.out.printf("| %d %d %d",media/10,min,max);
        }

      }
      media=0;
      min=0;
      max=0;
      System.out.println("");
    }


    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
  }
}