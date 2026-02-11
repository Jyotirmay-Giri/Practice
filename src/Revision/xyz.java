package Revision;

public class xyz {
    public static void main(String[] args) {

        Phone phone = new Phone("Apple",27);
        System.out.println(phone);

    }
}

class Phone{

    String Name;
    int price;
// Creating constructor for the above variables
    public Phone(String name, int price) {
        Name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }
}