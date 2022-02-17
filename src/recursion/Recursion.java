package recursion;

class rec{
     public static void main(String[] args) {
     //Recurion Practices
    }
    public static void recursion(int n){
        if(n==0){
            System.out.println("Fechado");
        } else {
            System.out.println("Recursion");
            n--;
        recursion(n);
    
     }
    }
}

class del extends rec {
    //Inheritance
public static void recursion(int n){
        if(n==0){
            System.out.println("Aberto");
        } else {
            System.out.println("Inheritance");
            n--;
        recursion(n);
    
     }
    }

}

public class Recursion {
//Polymorphism

    
  public static void main(String[] args){
    del execution = new del();
    execution.recursion(4);
    execution.Super(2);
   }
  }


