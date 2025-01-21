abstract class Family{
    int number = 1;
    String names = "Ebedi";
    abstract  void dispalynam();
}
class SimpleFem extends  Family{
    @Override
    void  dispalynam(){
        System.out.println("hellow world ");
    }
}
interface  MyQuato{
    int num = 10 ;
    void myQuato ();
}

interface PyramidStar{
    void  outPyramidStr();
}
class MySuggestion implements MyQuato, PyramidStar{
    @Override
     public void  myQuato(){
        System.out.println("Frist solve problem then write code ");
           }
    @Override
    public  void outPyramidStr(){
        System.out.println("Let Display Star*****");
        for (int i = 0; i <= 5 ; i++) {
          for (int a = 1 ; a <= 5 -i ; a++){
              System.out.print(" ");
          }
          for (int c = 1 ; c <= i*2-1;c++){
              System.out.print("*");
          }
            System.out.println(" ");
        }
    }
        }


public class SimpleAbstract {
    public static void main(String[] args) {
     SimpleFem obj = new SimpleFem();
     obj.dispalynam();
     MySuggestion objQuato = new MySuggestion();
     objQuato.myQuato();
        objQuato.outPyramidStr();
    }
}
