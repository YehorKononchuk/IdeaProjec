package Animals;

public class Cat extends Animal {

    String breed;

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка делает мяу мяу");
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест вискас");
        super.eat();
    }

    @Override
    public void getDescription() {
        System.out.println("Это подробное описанние кошки");
        super.getDescription();
    }
}

