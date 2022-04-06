package animals.impl.AbstractAnimal;

import animals.AbstractAnimal;

public class Chewbacca extends AbstractAnimal {
    private byte age = 100;

    @Override
    public void setAge(byte age) {
        super.setAge(age);
    }

    @Override
    public String sound() {
        return "GRAAAAWR";
    }

    @Override
    public String toString() {
        return "Co povida chewbacca? Tohle: " + sound() + " a kolik mu je? Tolik: " + age;
    }
}
