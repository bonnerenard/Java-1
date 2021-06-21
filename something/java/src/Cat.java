public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;

    }

    public void eat(Plate plate) {
        fullness = plate.decreaseFood(appetite);
    }

    public void info() {
        System.out.println(name + (fullness ? " сытый" : " голодный"));
    }
}
