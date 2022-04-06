package animals.impl.AbstractAnimal;

import animals.AbstractAnimal;

public class Pig extends AbstractAnimal {
    private byte age = 25;

    @Override
    public void setAge(byte age) {
        super.setAge(age);
    }
    @Override
    public String sound() {
        return "Chro Chro";
    }

    @Override
    public String toString() {
        return "Co povida prase? Tohle: " + sound() + " a kolik mu je? Tolik: " + age;
    }
}
