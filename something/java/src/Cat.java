public class Cat extends Animal {
    static int count;
    static final int limitRun = 200;

    Cat(String name) {
        super(name);
        count++;
    }

    void run(int dist) {
        if (dist < limitRun) {
            System.out.println(name + " пробежал " + dist + " м");
        } else System.out.println(name + " не может побежать столько");

    }

    void swim(int dist) {
        System.out.println(name + " не умеет плавать");
    }

}
