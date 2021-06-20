public class HomeWorkApp6 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Cat( "Шаварма");
        animals[1] = new Cat( "Пончик");
        animals[2] = new Dog( "Элвис");
        animals[3] = new Dog( "Мэлвис");
        animals[4] = new Dog( "Пюрешка");
        animals[5] = new Cat( "Котлетка");
        for(Animal animal : animals) {
            animal.run(250);
            animal.swim(5);
        }
        System.out.println("Колличество животных" + Animal.count);
        System.out.println("Колличество котиков" + Cat.count);
        System.out.println("Колличество пёсиков" + Dog.count);

    }

}
