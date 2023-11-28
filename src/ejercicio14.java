public class ejercicio14 {

    public static String pedirpalabra(){
      System.out.print("Introduzca una palabra: ");
      String palabra=System.console().readLine();
      return palabra;
    }


    public static void main(String[] args) throws Exception {
    try {
      String colores[]= new String[10];
      colores[0]="verde"; colores[1]="rojo"; colores[3]="azul"; colores[4]="amarillo"; colores[5]="naranja"; colores[6]="rosa"; colores[7]="negro"; colores[8]="blanco"; colores[9]="morado";
      String palabras[]=new String[8];
      String palabraconocida[]=new String[8];
      String palabradesconocida[]=new String[8];

      int contador=0;
      int contador2=0;

      boolean razon=false;
      for(int i=0;i<=7;i++){
        palabras[i]=pedirpalabra();

        for(int j=0;j<=9;j++){
          if(palabras[i].equals(colores[j])){
            palabraconocida[contador]=palabras[i];
            contador=contador+1;
            razon=true;
          }
        }
        if(razon==false){
          palabradesconocida[contador2]=palabras[i];
          contador2=contador2+1;
        }
        razon=false;
      }
      System.out.println("Array original: ");
      for(int i=0;i<=7;i++){
        System.out.print(palabras[i] +" ");
      }

      //for(int i=0;i<=7;i++){
        //System.out.print(palabraconocida[i] +" ");
      //}
      //System.out.println("");
      //for(int i=0;i<=7;i++){
        //System.out.print(palabradesconocida[i] +" ");
      //}

      for(int i=0;i<=7;i++){
        if(palabradesconocida[i]!=null){
          
          palabraconocida[contador]=palabradesconocida[i];
          contador=contador+1;
        }
        
      }
      System.out.println("");
      System.out.println("Array resultado: ");
      for(int i=0;i<=7;i++){
        System.out.print(palabraconocida[i] +" ");
      }


      } catch (Exception e) {
      System.out.println("Error inesperado");
    }

    
    }
}
