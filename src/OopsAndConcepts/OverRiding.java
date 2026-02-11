package OopsAndConcepts;

 class Car{
    void engine(){
        System.out.println("Petrol Engine");
    }
}

class tata extends Car{
    @Override
    void engine(){
        System.out.println("Diesel engine");
    }
}
class tesla extends Car{
    @Override
    void engine(){
        System.out.println("Ev");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        Car c = new tata();
        Car b = new tesla();

        c.engine();
        b.engine();
    }
}
