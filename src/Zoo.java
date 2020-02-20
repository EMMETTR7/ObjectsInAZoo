public class Zoo {

//    public static void main(String[] args){
//        Zoo z = new Zoo();
//        z.sleep("Tigger");
//        z.eat("Tigger", "bacon");
//        z.eat("Tigger", "chicken");
//
//
//    }
//
//    public void sleep(String name) {
//        System.out.println(name + " sleeps for 8 hours");
//    }
//
//
//    String favoriteFood = "bacon";
//
//    public void eat(String name, String food){
//        System.out.println(name + " eats " + food);
//        if (food.equals(favoriteFood)){
//            System.out.println("YUM!!!" + name + " wants more " + food);
//        } else {
//            System.out.println(name + " sleeps for 8 hours");
//        }
//    }
//
//
//
//
//
//



    public static void main(String[] args) {
        //make and run a main method
        Tiger tiger = new Tiger("Tigger");
        tiger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        Zookeeper z = new Zookeeper("Zoe");
        Animal[] a = {tiger, pooh, rarity, gemma, stinger};
        z.feedAnimals(a , "steak");
    }


}
