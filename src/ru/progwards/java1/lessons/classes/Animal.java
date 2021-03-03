package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;

    public Animal(double weight) {
        this.weight = weight;
            }
//            2.1 В классе Animal реализовать метод:
//    public double getWeight(), который возвращает вес животного

    public double getWeight(){
        return weight;
    }
    public double getFoodCoeff(){
        return 0.02;
    }
    public double calculateFoodWeight(){

        return getWeight() * getFoodCoeff();
    }
    enum AnimalKind {
        ANIMAL, COW, HAMSTER, DUCK
    }
    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }
    enum FoodKind {
        UNKNOWN, HAY, CORN
    }
    public FoodKind getFoodKind() {

        return FoodKind.UNKNOWN;
    }
    public String toString() {
//        String zver = "I am " + getKind() + ", eat "+ getFoodKind();
//        System.out.println( zver);
//        return zver;
        return "I am " + getKind() + ", eat " + getFoodKind();
    }
    public String toStringFull(){
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }

    public static void main(String[] args){
        Animal a = new Animal(5.3);
        System.out.println(a);
        System.out.println(a.toStringFull());

    }

}
      class Cow extends Animal {
          public Cow(double weight) {
              super(weight);
          }
          @Override
          public double getFoodCoeff(){
              return 0.05;
          }
          @Override
          public AnimalKind getKind() {
              return AnimalKind.COW;
          }
          @Override
          public FoodKind getFoodKind() {
              return FoodKind.HAY;
          }

    public static void main(String[] args){
        Cow b = new Cow(4.3);
        System.out.println(b);
        System.out.println(b.toStringFull());

    }
        }
class Hamster extends Animal {
    public Hamster(double weight) {
        super(weight);
    }
    @Override
    public double getFoodCoeff(){
        return 0.03;
    }
    @Override
    public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
    }
    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    public static void main(String[] args){
        Hamster b = new Hamster(4.3);
        System.out.println(b);
        System.out.println(b.toStringFull());

    }
}
class Duck extends Animal {
    public Duck(double weight) {
        super(weight);
    }
    @Override
    public double getFoodCoeff(){
        return 0.04;
    }
    @Override
    public AnimalKind getKind() {
        return AnimalKind.DUCK;
    }
    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }
       public static void main(String[] args){
           Duck b = new Duck (4.3);
        System.out.println(b);
           System.out.println(b.toStringFull());
    }
}






