public class ejercicio21 {

  public static int random(){
    int random=(int) (Math.random()*501);
    return random;
  }

  


  public static void main(String[] args) throws Exception {
  try {
    
   int lista[]=new int[15];
   int listafinal[]=new int[15];
   for(int i=0;i<=14;i++){
    lista[i]=random();

    if(lista[i]%5==0){
      listafinal[i]=lista[i];
    }else{
      int copialista=lista[i];

      while(copialista%5!=0){
        copialista++;
      }
      listafinal[i]=copialista;
    }
   }

   System.out.println("Array original: ");
   for(int i=0;i<=14;i++){
    System.out.print(lista[i] +" ");
   }

   System.out.println("");
   System.out.println("Array circuerizado: ");
   for(int i=0;i<=14;i++){
    System.out.print(listafinal[i] +" ");
   }


    } catch (Exception e) {
    System.out.println("Error inesperado");
  }

  
  }
}