public class ejercicio7 {

    public static int aleatorio(){
      int aleatorio=(int) (Math.random()*20 +1);
      return aleatorio;
    }

    public static int intercamio(){
      int numero=Integer.parseInt(System.console().readLine());
      return numero-1;
    }
    
    public static void main(String[] args) throws Exception {
    
    int lista[]=new int[100];


    for(int i=0;i<=99;i++){
      int random=aleatorio();
      lista[i]=random;
    }

    for(int i=0;i<=99;i++){
      System.out.print(+lista[i] +" ");

      if(i==50){
        System.out.println("");
      }
    }
    System.out.println("");
    System.out.println("Introduce el numero de los valores que quieres intercambiar");
    System.out.print("Primer numero: ");
    int num1=intercamio();
    System.out.print("Segundo numero: ");
    int num2=intercamio();
    

    for(int i=0;i<=99;i++){
      if(lista[i]==num1+1){
        System.out.println(lista[i]);
        num1=i;
        break;
      }
    }

    for(int i=0;i<=99;i++){
      if(lista[i]==num2+1){
        num2=i;
        break;
      }
    }


    int repositorio1=lista[num1];
    int repositorio2=lista[num2];
    lista[num1]=repositorio2;
    lista[num2]=repositorio1;
    

    for(int i=0;i<=99;i++){
      
      if(i==num1){
        System.out.print("*"+lista[i] +"* ");
      }else if(i==num2){
        System.out.print("*"+lista[i] +"* ");
      }else{
        System.out.print(""+lista[i] +" ");
      }

      if(i==50){
        System.out.println("");
      }
    }



    }
}
