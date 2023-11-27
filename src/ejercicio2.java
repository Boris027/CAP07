public class ejercicio2 {
    public static void main(String[] args) throws Exception {
       
      
      char[] lista=new char[10];

      lista[0]='a';
      lista[1]='x';
      lista[4]='@';
      lista[6]=' ';
      lista[7]='+';
      lista[8]='Q';
        
       

      for(int i=0;i<=9;i++){
        System.out.printf("El caracter[%d]es=%s%n",i,lista[i]);
      }
    }
}
