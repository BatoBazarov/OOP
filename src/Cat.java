 class Cat extends Animal {
        public String name;
        public int run;
        public int swim;

        public Cat(String name, int run, int swim, ) {
                this.name = name;
                this.run = run;
                this.swim = swim;
        }

        public void getRun() {
                return run();
                System.out.println("The cat ran");
        }

        public void getSwim() {
                return swim;
                System.out.println("Cat can't swim");
        }


}


