public class ejercicio12  {

    public static int pedirnum(){
      int numero=Integer.parseInt(System.console().readLine());
      return numero;
    }


    public static void main(String[] args) throws Exception {
      int lista[]=new int[10];
      int listafinal[]=new int [10];

      for(int i=0;i<=9;i++){
        System.out.printf("Introduce un numero [%d/10]: ",i+1);
        lista[i]=pedirnum();
      }

      //array inicial

      for(int i=0;i<=9;i++){
        System.out.printf("[%d/10]: %d%n",i+1,lista[i]);
      }

      //posiciones
      System.out.print("Introduzca la posicion inicial: ");
      int posicioninicial=pedirnum();
      System.out.print("Introduzca la posicion final: ");
      int posicionfinal=pedirnum();
      posicioninicial=posicioninicial-1;

      int listaprincipio[]=new int [10];
      //numerosfinal
      for(int i=posicionfinal-1;i<=9;i++){
        //System.out.println(lista[i]);
        listaprincipio[i]=lista[i];
      }
      //numerosinicio
      boolean prueba=false;
      //System.out.println("-----------");
      for(int i=0;i<posicionfinal;i++){
        if(posicioninicial==i){
          listafinal[i+1]=lista[i+1];
           prueba=true;
        }else if(posicionfinal-1==i){
          //System.out.println(lista[posicioninicial]);
          listafinal[i]=lista[posicioninicial];
        }else {//System.out.println(lista[i]);

          if(prueba==true){
            listafinal[i+1]=lista[i+1];
          }else listafinal[i+1]=lista[i];
        }
        
      }

      boolean prubea=false;
      for(int i=0;i<=9;i++){

        if(i==9){
          listafinal[0]=listaprincipio[i];
          if(listafinal[i]==0 && listaprincipio[i]>0){
            listafinal[i]=listaprincipio[i-1];
            //System.out.println("*"+listafinal[i]+""+i);
            
          }
        }else{
          if(listafinal[i]==0 && listaprincipio[i]>0){
            listafinal[i]=listaprincipio[i-1];
            //System.out.println("*"+listafinal[i]+""+i);
            
          }
        }

        
      }
      

      //System.out.println("---------");
      for(int i=0;i<=9;i++){
        //System.out.println(listaprincipio[i]);
      }


      //System.out.println("---------");
      for(int i=0;i<=9;i++){
        System.out.printf("[%d/10]: %d%n",i+1,listafinal[i]);
      }

      
      


      
      


    }
}
