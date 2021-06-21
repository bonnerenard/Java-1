public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        if (food < appetite) {
            return false;
        } else {
            this.food -= appetite;
            return true;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }
    public void addFood(int yummy){
       food  = food + yummy;
    }
}
