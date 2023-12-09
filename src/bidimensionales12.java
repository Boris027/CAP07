public class bidimensionales12 {

  public static int random(){
    int random=(int)(Math.random()*401 +500);
    return random;
  }
  

  public static void main(String[] args) throws Exception {
  try {

    int lista[][]=new int [9][9];
    int max=0;
    for(int i=0;i<=8;i++){

      for(int j=0;j<=8;j++){
        lista[i][j]=random();

        if(lista[i][j]>max){
          max=lista[i][j];
        }
      }
    }
    
    int largo=Integer.toString(max).length();
    


    for(int i=0;i<=8;i++){

      for(int j=0;j<=8;j++){
        System.out.printf("%-" +(largo+1)+"d",lista[i][j]);
      }
      System.out.println("");
    }

    
    int maximo=0;
    int minimo=0;
    int media=0;
    int sumar=8;
    String listafinal="";
    for(int i=0;i<=8;i++){

      
       
        listafinal=listafinal+lista[i][sumar] +" ";
        media=media+lista[i][sumar];

      if(i==0){
        max=lista[i][sumar];
        minimo=lista[i][sumar];
      }

      if(lista[i][sumar]<minimo){
        minimo=lista[i][sumar];
      }

      if(lista[i][sumar]>maximo){
        maximo=lista[i][sumar];
      }

        sumar=sumar-1;
        
      
    }

    
    System.out.println("");
    System.out.println("Esta es la lista de los numeros en diagonal: "+listafinal);
    System.out.println("Esta es la media: "+ (float)media/10);
    System.out.println("Este es el maximo: "+maximo);
    System.out.println("Este es el minimo: "+minimo);


    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
  }
}