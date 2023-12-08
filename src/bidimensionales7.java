public class bidimensionales7 {

  public static int random(int numero){
    int random=(int) (Math.random()*numero);
    return random;
  }


  public static int pedirnum(){
    int numero=Integer.parseInt(System.console().readLine());
    return numero;
  }


  public static void main(String[] args) throws Exception {
  try {
    boolean ganar=false;
    boolean perder=false;
    boolean aviso=false;
    int filas=4;
    int columnas=5;
    String lista[][]=new String [filas][columnas];
    String listafalsa[][]=new String [filas][columnas];
    //poner todo a 0

    for(int i=0;i<=filas-1;i++){
      
      for(int j=0;j<=4;j++){
        lista[i][j]=" ";
        listafalsa[i][j]=" ";
      }
    }


    
    //random1
    int filarandom=random(filas);
    int columnarandom=random(columnas);



    int filaguardada=filarandom;
    int columnaguardada=columnarandom;

    lista[filarandom][columnarandom]="*";
    String random1=filarandom +""+columnarandom;
    
    //random2
    String random2="";
    do {
      filarandom=random(filas);
      columnarandom=random(columnas);
      
      random2=filarandom +""+columnarandom;
    } while (random2.equals(random1));
    lista[filarandom][columnarandom]="?";

    //random3
    String random3="";
    do {
      filarandom=random(filas);
      columnarandom=random(columnas);
      
      random3=filarandom +""+columnarandom;
    } while (random3.equals(random1) || random3.equals(random2));
    lista[filarandom][columnarandom]="?";





    for (int i=0;i<=filas-1;i++){

      System.out.print(i+"| ");

      for(int j=0;j<=columnas-1;j++){

       
        System.out.print(listafalsa[i][j]);
      }

      System.out.println("");

    }

    System.out.print("   ");
    for(int i=0;i<=columnas-1;i++){
      System.out.print("-");
    }
    System.out.println("");
    System.out.print("   ");
    for(int i=0;i<=columnas-1;i++){
      System.out.print(i);
    }

    System.out.println("");


   
    //bucle que se muestra
    int intentos=3;
    while (perder==false) {
      
    

    System.out.println("Le quedan "+ intentos +" intentos");
    System.out.print("Introduce la fila: ");
    int filaelegida=pedirnum();
    System.out.print("Introduce la columna: ");
    int columnaelegida=pedirnum();
    

    for (int i=0;i<=filas-1;i++){

      System.out.print(i+"| ");

      for(int j=0;j<=columnas-1;j++){

        if(lista[filaelegida][columnaelegida].equals(" ") && filaelegida==i && columnaelegida==j){
          listafalsa[i][j]="X";
        }else if(lista[filaelegida][columnaelegida].equals("?") && filaelegida==i && columnaelegida==j){
          listafalsa[i][j]="?";
          ganar=true;
        }else if(lista[filaelegida][columnaelegida].equals("*") && filaelegida==i && columnaelegida==j){
          listafalsa[i][j]="*";
          perder=true;
        }

        if(lista[filaelegida][columnaelegida].equals(" ") && filaelegida==i && columnaelegida==j && filaelegida==filaguardada || filaelegida==filaguardada+1 || filaelegida==filaguardada-1 && columnaelegida==columnaguardada || columnaelegida==columnaguardada-1 || columnaelegida==columnaguardada+1){
          aviso=true;
        }

        System.out.print(listafalsa[i][j]);
      }

      System.out.println("");

      

    }






    //parte de abajo
    System.out.print("   ");
    for(int i=0;i<=columnas-1;i++){
      System.out.print("-");
    }
    System.out.println("");
    System.out.print("   ");
    for(int i=0;i<=columnas-1;i++){
      System.out.print(i);
    }

    intentos--;

    if(intentos==0){
      perder=true;
    }

    System.out.println("");
    if(ganar==true){
        System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
        break;
      }

      if(perder==true){
        System.out.println("Vaya, has perdido.");
        break;
      }
    
      if(aviso==true){
        System.out.println("Cuidado, hay una mina cerca!");
        aviso=false;
      }

      

      }
    
    } catch (Exception e) {
    System.out.println("Error inesperado");
  }

  
  }
}