public class bidimensionales5 {

 
  public static int random(){
    int random=(int) (Math.random()*1001);
    return random;
  }


  public static void main(String[] args) throws Exception {
  try {
   
    int lista[][]=new int[6][10];
    
    int max=0;
    int min=0;
    String ubicacionmax="";
    String ubicacionmin="";
    for(int i=0;i<=5;i++){

      for(int j=0;j<=9;j++){

        lista[i][j]=random();
        if(i==0 && j==0){
          max=lista[i][j];
          min=lista[i][j];
          ubicacionmax="Fila: "+i +" Columna: "+j;
          ubicacionmin="Fila: "+i +" Columna: "+j;
        }

        if(lista[i][j]>max){
          max=lista[i][j];
          ubicacionmax="Fila: "+i +" Columna: "+j;
        }

        if(lista[i][j]<min){
          min=lista[i][j];
          ubicacionmin="Fila: "+i +" Columna: "+j;
        }

      }
    }
    System.out.print(" ");
    for(int i=0;i<=9;i++){
      System.out.printf("%5d",i);
    }
    System.out.println("");

    for(int i=0;i<=5;i++){
      System.out.printf("%d ",i);
      for(int j=0;j<=9;j++){

        System.out.printf("%5d",lista[i][j]);
      }
      System.out.println("");
    }


    System.out.println("El numero mas grande es: "+max +" "+ubicacionmax);
    System.out.println("El numero mas pequeño es: "+min +" "+ubicacionmin);



    
    } catch (Exception e) {
    System.out.println("Error inesperado");
  }

  
  }
}