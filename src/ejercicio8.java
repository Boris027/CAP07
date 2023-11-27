public class ejercicio8 {

    public static int temperatura(){
      int temperatura=Integer.parseInt(System.console().readLine());
      return temperatura;
    }
    
    public static String meses(int numero){
      String devolver="";
      switch (numero) {
        case 1:
          devolver= "Enero";
          break;
        case 2:
          devolver= "Febrero";
          break;
        case 3:
          devolver= "Marzo";
          break;
        case 4:
          devolver= "Abril";
          break;
        case 5:
          devolver= "Mayo";
          break;
        case 6:
          devolver= "Junio";
          break;
        case 7:
          devolver= "Julio";
          break;
        case 8:
          devolver= "Agosto";
          break;
        case 9:
          devolver= "Septiembre";
          break;
        case 10:
          devolver= "Octubre";
          break;
        case 11:
          devolver= "Noviembre";
          break;
        case 12:
          devolver= "Diciembre";
          break;
        default:
          break;
      }
      return devolver;
    }
    public static void main(String[] args) throws Exception {
    int grande=0;
    int meses[] = new int[12];
    
    for(int i=0;i<=11;i++){
      String mes=meses(i+1);
      System.out.printf("Introduzca la media de temperatura de %s: ",mes);
      meses[i]=temperatura();

      if(i==0){
        grande=meses[i];
      }else if(grande<meses[i]){
        grande=meses[i];
      }

    }

    for(int i=1;i<=15;i++){
      System.out.print(" ");
    }
    
    
    for(int i=1;i<=grande;i++){
      System.out.print(" -");
    }
    System.out.println("");
    


    for(int i=0;i<=11;i++){
      System.out.printf("Mes %-10S ",meses(i+1) );
      boolean repeticion=false;


      for(int j=1;j<=meses[i];j++){
        if(j==1){System.out.print("|");}
        System.out.print("*|");
      }

      for(int k=1;k<=grande-meses[i];k++){
        System.out.print(" |");
      }

      System.out.print(" "+ meses[i]+"º");
      System.out.println("");
      
      

      for(int w=1;w<=15;w++){
      System.out.print(" ");
    }
    for(int p=1;p<=grande;p++){
      System.out.print(" -");
    }




      System.out.println("");
    }


    
    }
}
