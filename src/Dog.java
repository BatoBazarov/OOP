public class Dog  extends Animal {
    public Dog(String name) {
    super(name);
    }

    @Override
    public void run(int distance) {
        if (distance < 500) {
            System.out.println("The dog run");
        }     else {
            System.out.println("The dog didn't run");
        }
    }
    @Override
    public void swim(int distance) {
        if (distance< 10) {
            System.out.println("The dog swim");
        }     else {
            System.out.println("The dog didn't swim");
        }
    }
}

