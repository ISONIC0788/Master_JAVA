abstract  class  Vehical{
    int a ;
    int b ;
    abstract void  go ();
}
class  Car extends  Vehical{
    @Override
    void  go(){
     System.out.println("Hellow Car can move in long distance ");
    }
}

// second abstract
abstract class People{
    abstract  void info();
}
class Person extends People {
    @Override
    void  info(){
        String name = "KGH";
        String school = "Apeki";
        String gender = "Male";
        int date  = 123;
        System.out.printf("%-15s%-15s%-15s%-5d",name,school,gender,date);
    }
}

public class AbastractExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();
        Person person = new Person();
        person.info();
    }

}
