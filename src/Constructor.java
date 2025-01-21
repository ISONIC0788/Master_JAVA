class Dogs {
    String name ;
    int age ;
    Dogs(){
       name = "Ebedi";
       age = 27;
    }
}

public class Constructor {
    public static void main(String[] args) {
     Dogs objDogs = new Dogs();
    System.out.println("Th.... "+objDogs.name);
    System.out.println("Th.... "+objDogs.age);
    }
}
