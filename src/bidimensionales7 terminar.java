public class bidimensionales7 {

  public static int pedirnum(){
    System.out.print("Introduce un numero: ");
    int numero=Integer.parseInt(System.console().readLine());
    return numero;
  }

  public static int aleatorioalto(){
    int random=(int) (Math.random()*4);
    return random;
  }

  public static int aleatorioancho(){
    int random=(int) (Math.random()*5);
    return random;
  }


  public static void main(String[] args) throws Exception {
  try {
    String campo[][]=new String[4][5];

    

    for(int i=0;i<=3;i++){
      for(int j=0;j<=4;j++){
        campo[i][j]=" ";
      }
    }

    campo[aleatorioalto()][aleatorioancho()]="*";
    int alturaaleatoria=aleatorioalto();
    int anchuraaleatoria=aleatorioancho();
    
    int contador=0;
    do {
      alturaaleatoria=aleatorioalto();
      anchuraaleatoria=aleatorioancho();
      campo[alturaaleatoria][anchuraaleatoria]="?";
      contador++;
      if(contador==1){
        break;
      }
    } while (campo[alturaaleatoria][anchuraaleatoria]!="*");


     contador=0;
    do {
      alturaaleatoria=aleatorioalto();
      anchuraaleatoria=aleatorioancho();
      campo[alturaaleatoria][anchuraaleatoria]="?";
      contador++;
      if(contador==1){
        break;
      }
    } while (campo[alturaaleatoria][anchuraaleatoria]!="*" && campo[alturaaleatoria][anchuraaleatoria]!="?");

    
    




    
    for(int i=0;i<=3;i++){
      System.out.printf("%d|",i);

      for(int j=0;j<=4;j++){
        System.out.print(" "+campo[i][j]);
      }
      System.out.println("");
    }


    System.out.print("  ");
    for(int i=0;i<=4;i++){
      System.out.printf("%2s","-");
    }System.out.println("");

    System.out.print("  ");
    for(int i=0;i<=4;i++){
      System.out.printf("%2d",i);
    }


    } catch (Exception e) {
    System.out.println("Error inesperado");
  }

  
  }
}