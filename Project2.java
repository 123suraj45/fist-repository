import java.util.Scanner;

class Car {
    float speed;
    float regularPrice;
    String color;
    public float getRegularPrice(){return regularPrice;}
}
class Truck extends Car{
    float weight;
    public float getSaleprice (){
        if(weight>2300)
        return regularPrice*(0.9f);
        else
        return regularPrice*(0.8f);
    }
}
public class Project2 {
    public static void main(String[] args) {
        Truck c1 =new Truck();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter regular price of car(in lakh)");
        c1.regularPrice=sc.nextFloat();
        System.out.println("Enter speed of car");
        c1.speed=sc.nextFloat();
        System.out.println("Enter weight of car");
        c1.weight=sc.nextFloat();
        System.out.println("Enter color of car");
        c1.color=sc.next();
        System.out.println("Sale Price(in lakh):"+c1.getSaleprice());
    
    }
}