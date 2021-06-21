public class HomeWork7 {
    public static void main(String[] args){
        Cat[]cats = new Cat[5];
        cats[0] = new Cat("Абдул", 5);
        cats[1] = new Cat("Катёин", 15);
        cats[2] = new Cat("Игги", 60);
        cats[3] = new Cat("Джозеф", 30);
        cats[4] = new Cat("Джостар", 30);
        Plate plate =new Plate(80);
        for(Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        plate.addFood(40);
        plate.info();
    }


}
