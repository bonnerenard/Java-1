public class Dog extends Animal {
    static int count;
    static final int limitRun = 500;
    static final int limitSwim = 10;

    Dog(String name) {
        super(name);
        count++;
    }

    void run(int dist) {
        if (dist < limitRun) {
            System.out.println(name + " пробежал " + dist + " м");
        } else System.out.println(name + " не может побежать столько");
    }

    void swim(int dist) {
        if (dist < limitSwim) {
            System.out.println(name + " проплыл " + dist + " м");
        } else System.out.println(name + " не может проплыть столько");
    }
}
