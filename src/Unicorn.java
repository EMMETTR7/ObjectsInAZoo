public class Unicorn extends Animal {
    public Unicorn(String n) {
        super(n, "marshmallows");
    }

    public void sleep() {
        System.out.println(name + " sleeps in a cloud");
    }
    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
            sleep();
        } else {
            sleep();
        }
    }
}
