package animals.impl.AbstractAnimal;

import animals.AbstractAnimal;

public class Goat extends AbstractAnimal {
    private byte age = 18;

    @Override
    public void setAge(byte age) {
        super.setAge(age);
    }
    @Override
    public String sound() {
        return "Meee";
    }

    @Override
    public String toString() {
        return "Co povida koza? Tohle: " + sound() + " a kolik ji je? Tolik: " + age;
    }
}
