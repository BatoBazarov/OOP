 public class Cat extends Animal {
     public Cat(String name) {
         super(name);
     }

     @Override
     public void run(int distance) {
   if (distance < 200) {
    System.out.println("The cat run");
}     else {
    System.out.println("The cat didn't run");
}
     }
    @Override
     public void swim(int distance) {
         System.out.println ("Cat can't swim");
    }
 }

