package animals.impl.AbstractAnimal;

import animals.AbstractAnimal;

public class Dog extends AbstractAnimal {
    private byte age = 1;

    @Override
    public void setAge(byte age) {
        super.setAge(age);
    }
    @Override
    public String sound() {
        return "Haf";
    }

    @Override
    public String toString() {
        return "Co povida pes? Tohle: " + sound() + " a kolik mu je? Tolik: " + age;
    }

}
