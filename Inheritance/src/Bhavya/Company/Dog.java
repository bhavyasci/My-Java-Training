package Bhavya.Company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,int eyes,int legs,int tails, int teeth,String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tails=tails;
        this.teeth=teeth;
        this.coat=coat;
    }

    private void chew(){
        System.out.println("dog.chew called");
    }


    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("dog.walk() called");
        move(5);
    }

    public void run(){
        System.out.println("dog.run() called");
        move(10);
    }

    private void moveLges(int speed){
        System.out.println("dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.Move() called");
        moveLges(speed);
        super.move(speed);
    }

    //    public int getEyes() {
//        return eyes;
//    }
//
//    public int getLegs() {
//        return legs;
//    }
//
//    public int getTails() {
//        return tails;
//    }
//
//    public int getTeeth() {
//        return teeth;
//    }
//
//    public String getCoat() {
//        return coat;
//    }

}
