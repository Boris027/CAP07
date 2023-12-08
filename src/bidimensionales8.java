public class bidimensionales8 {

  public static int pedirnum(){
    int numero=Integer.parseInt(System.console().readLine());
    return numero;
  }

  
  public static int traductor(String numero){
    int fila=0;

    if(numero.equals("a")){
      return 1;
    }else if(numero.equals("b")){
      return 2;
    }else if(numero.equals("c")){
      return 3;
    }else if(numero.equals("d")){
      return 4;
    }else if(numero.equals("e")){
      return 5;
    }else if(numero.equals("f")){
      return 6;
    }else if(numero.equals("g")){
      return 7;
    }else if(numero.equals("h")){
      return 8;
    }

    return 0;
  }


  public static String traductorinverso(int numero){
    String devuelta="";
    switch (numero) {
      case 1:
        devuelta="a";
        break;
      case 2:
        devuelta="b";
        break;
      case 3:
        devuelta="c";
        break;
      case 4:
        devuelta="d";
        break;
      case 5:
        devuelta="e";
        break;
      case 6:
        devuelta="f";
        break;
      case 7:
        devuelta="g";
        break;
      case 8:
        devuelta="h";
        break;
      default:
        break;
    }

    return devuelta;
  }


  public static void main(String[] args) throws Exception {
  try {
   
    String lista[][]=new String[8][8];


    for(int i=0;i<=7;i++){
      for(int j=0;j<=7;j++){
      lista[i][j]="*";
    }
    }

    System.out.print("Introduzca la posición del alfil (ejemplo: b1): ");
    String posicionajedrez=System.console().readLine();
    String cadena1=posicionajedrez.substring(0,1);
    String cadena2=posicionajedrez.substring(1); 
    String posiblesmov="";
    
    

    int fila=traductor(cadena1);
    int columna=Integer.parseInt(cadena2);
    int uwu=0;
    uwu=fila;
    fila=columna;
    columna=uwu;

    fila=fila-1;
    columna=columna-1;


    //arriba a la derecha
    int posicion=1;
    for(int i=fila+1;i<=7;i++){
      for(int j=0;j<=7;j++){
      if(j==columna+posicion){
        lista[i][j]="x";
        
      }
    }
    posicion++;
    }

    //arriba a la izquierda

    posicion=-1;
    for(int i=fila+1;i<=7;i++){
      for(int j=0;j<=7;j++){
      if(j==columna+posicion){
        lista[i][j]="x";
        
      }
    }
    posicion--;
    }

    //abajo a la derecha

    posicion=1;
    for(int i=fila-1;i>=0;i--){
      for(int j=0;j<=7;j++){
      if(j==columna+posicion){
        lista[i][j]="x";
        
      }
    }
    posicion++;
    }

    //abajo a la izquierda

    posicion=-1;
    for(int i=fila-1;i>=0;i--){
      for(int j=0;j<=7;j++){
      if(j==columna+posicion){
        lista[i][j]="x";
        
      }
    }
    posicion--;
    }





    for(int i=7;i>=0;i--){

      System.out.print(i+1 +"| ");

      for (int j=0;j<=7;j++){

        if(i==fila && j==columna){
          lista[i][j]="&";
          
        }
        System.out.print(lista[i][j]);
        System.out.print(" ");
      }
      System.out.println("");
    }








    System.out.print("   ");
    for(int i=0;i<=7;i++){
      System.out.print("- ");
    }
    System.out.println("");

    System.out.print("   ");

    System.out.print("a b c d e f g h");

    System.out.println("");



    for(int i=0;i<=7;i++){

      for(int j=0;j<=7;j++){
        
        if(lista[i][j].equals("*")){
          
          

        }else{
          if(i==fila && j==columna){

          }else posiblesmov=posiblesmov+""+traductorinverso(j+1) +""+(i+1)+" ";
        } 

      }
    }




    System.out.println("Los posibles movimientos son: "+posiblesmov);
    
    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
  }
}