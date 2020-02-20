public class Animal {
    String name;
    String favoriteFood;
    static int population = 0;

    public Animal(String n, String ff) {
        this.name = n;
        this.favoriteFood = ff;
        population++;
    }

    public void sleep() {
        System.out.println(name + " sleeps for 8 hours");

    }


    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            sleep();
        }
    }

}
