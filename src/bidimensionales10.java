public class bidimensionales10 {

  
  public static int traductor(String columna){
    int devolver=0;
    if(columna.equals("a")){
      devolver=0;
    }else if(columna.equals("b")){
      devolver=1;
    }else if(columna.equals("c")){
      devolver=2;
    }

    return devolver;
  }
  
  public static int random(){
    int numero=(int) (Math.random()*3);
    return numero;
  }

  public static void main(String[] args) throws Exception {
  try {
   

    String lista[][]=new String[3][3];


    //lo pone todo en blaco
    for(int i=0;i<=2;i++){

      for(int j=0;j<=2;j++){
        lista[i][j]=" ";
      }
    }


    System.out.println("  a b c");
    System.out.println("  - - -");
    for(int i=0;i<=2;i++){

      System.out.print(i+1);
      for(int j=0;j<=2;j++){

        System.out.print("|"+lista[i][j]);

        if(j==2){
          System.out.print("|");
        }
      }
      System.out.println("");
      System.out.println("  - - -");
      

    }


    //empieza lo importante

    boolean ganar=false;
    boolean perder=false;
    boolean empate=false;


    while (ganar==false || perder==false || empate==false) {
      
    
    System.out.print("Introduce la ubicacion, ejemplo(a1): ");
    String ubicacion=System.console().readLine();

    String columna=ubicacion.substring(0,1);
    int fila=Integer.parseInt(ubicacion.substring(1));
    int columnanumero=traductor(columna);
    fila=fila-1;
    

    //comprobacion que no permite que escoja una ubicación ya elegida
    if(lista[fila][columnanumero].equals("X") || lista[fila][columnanumero].equals("O")){
      System.out.println("Error, esa ubicación ya estaba cogida");
      int exit=5/0;
      }
    //fin de la comprobacion
    lista[fila][columnanumero]="X";

    System.out.println("  a b c");
    System.out.println("  - - -");

    for(int i=0;i<=2;i++){

      System.out.print(i+1);
      for(int j=0;j<=2;j++){

        System.out.print("|"+lista[i][j]);

        if(j==2){
          System.out.print("|");
        }
      }
      System.out.println("");
      System.out.println("  - - -");
      

    }
    

    //ganar
    
    if(lista[0][0].equals("X") && lista[1][1].equals("X") && lista[2][2].equals("X")){
      System.out.println("Has ganado!!");
      break;
    }

    if(lista[0][2].equals("X") && lista[1][1].equals("X") && lista[2][0].equals("X")){
      System.out.println("Has ganado!!");
      break;
    }


    int contador2=0;
    for(int i=0;i<=2;i++){
      for(int j=0;j<=2;j++){
        
        if(lista[i][j].equals("X")){
          contador2=contador2+1;
         
          if(contador2==3){
            ganar=true;
          }
        }
      }
      contador2=0;
    }

   


    
    for(int i=0;i<=2;i++){
      
      for(int j=0;j<=2;j++){

        if(lista[j][i].equals("X")){
          
          contador2=contador2+1;
          if(contador2==3){
            ganar=true;
          }
        }
      }
      contador2=0;
    }

    if(ganar==true){
      System.out.println("Has ganado!!");
      break;
    }

    //terminar ganar

    //empate
    int contador=0;
    for(int i=0;i<=2;i++){

      for(int j=0;j<=2;j++){

        if(lista[i][j].equals(" ")){
          contador=contador+1;
        }
      }
    }

    if(contador==0){
      System.out.println("Empate");
      break;
    }
    contador=0;
    //termina empate

    System.out.println("Turno del ordenador");
    int randomfila=0;
    int randomcolumna=0;
    do {
      randomfila=random();
      randomcolumna=random();
    } while (lista[randomfila][randomcolumna].equals("X") || lista[randomfila][randomcolumna].equals("O"));
     
    lista[randomfila][randomcolumna]="O";
    
    

    System.out.println("  a b c");
    System.out.println("  - - -");
    for(int i=0;i<=2;i++){

      System.out.print(i+1);
      for(int j=0;j<=2;j++){

        System.out.print("|"+lista[i][j]);

        if(j==2){
          System.out.print("|");
        }
      }
      System.out.println("");
      System.out.println("  - - -");
      

    }

    //perder
    if(lista[0][0].equals("O") && lista[1][1].equals("O") && lista[2][2].equals("O")){
      System.out.println("Has perdido");
      break;
    }

    if(lista[0][2].equals("O") && lista[1][1].equals("O") && lista[2][0].equals("O")){
      System.out.println("Has perdido");
      break;
    }


    contador2=0;
    for(int i=0;i<=2;i++){
      for(int j=0;j<=2;j++){
        
        if(lista[i][j].equals("O")){
          contador2=contador2+1;
         
          if(contador2==3){
            perder=true;
          }
        }
      }
      contador2=0;
    }



    for(int i=0;i<=2;i++){
      
      for(int j=0;j<=2;j++){

        if(lista[j][i].equals("O")){
          
          contador2=contador2+1;
          if(contador2==3){
            perder=true;
          }
        }
      }
      contador2=0;
    }



    if(perder==true){
      System.out.println("Has perdido");
      break;
    }


    //termina perder


    }

    


    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
  }
}