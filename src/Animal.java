
public abstract class Animal {

    public static void main(String[] args) {

        protected String name;
        protected int run;
        protected int swim;

     public Animal(String name, int run, int swim){
            this.name = name;
            this.run = run;
            this.swim = swim;

            Animal[] animals = new Animal[4]
            animals[0] = new Dog("Bobik", 400, 10);
            animals[1] = new Dog("Bonnie", 300, 7);
            animals[2] = new Cat("Bruno", 200, 5);
            animals[3] = new Cat("Miki", 100, 0);
        }
    }
}





