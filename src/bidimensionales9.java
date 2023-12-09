public class bidimensionales9 {

  public static int random(){
    int random=(int)(Math.random()*101);
    return random;
  }
  
  


  public static void main(String[] args) throws Exception {
  try {
    int lista[][]=new int[12][12];
    int max=0;

    //asignar valor aleatorio
    for(int i=0;i<=11;i++){
      for(int j=0;j<=11;j++){
        lista[i][j]=random();
        if(lista[i][j]>max){
          max=lista[i][j];
        }
      }
      
    }
    
    int largo=Integer.toString(max).length();

    //primer array resultado
    System.out.println("Resultado original: ");
    for(int i=0;i<=11;i++){
      for(int j=0;j<=11;j++){

        System.out.printf("%"+(largo+1)+"d",lista[i][j]);
      }
      System.out.println("");
    }
    

    //saca los ultimos numeros de cada fila
    int listarara[]=new int [11];
    
    for(int i=0;i<=10;i++){
      listarara[i]=lista[i][11];
      
    }
    



    //mueve todos los numeros uno a la derecha
    int ultimo=lista[11][11];
    for(int i=0;i<=11;i++){
      
      for(int j=10;j>=0;j--){
        lista[i][j+1]=lista[i][j];
      }
    }

    lista[0][0]=ultimo;
    
    //pone los numeros que estaban a la derecha del todo en el primero de la siguiente fila
    for(int i=0;i<=10;i++){
     lista[i+1][0]=listarara[i];
    }










    //arrary resultado

     System.out.println("Resultado final: ");
    for(int i=0;i<=11;i++){
      for(int j=0;j<=11;j++){

        System.out.printf("%"+(largo+1)+"d",lista[i][j]);
      }
      System.out.println("");
    }

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
  }
}