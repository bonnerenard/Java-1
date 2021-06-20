public abstract class Animal {
    static int count;
    protected String name;

    Animal( String name){
        this.name = name;
        count++;
    }

    abstract void run (int dist);
    abstract void swim (int dist);
}

