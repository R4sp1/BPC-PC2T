package animals.impl.AbstractAnimal;

import animals.AbstractAnimal;

public class Cow extends AbstractAnimal {

    private final byte age = 12;

    @Override
    public void setAge(byte age) {
        super.setAge(age);
    }
    @Override
    public String sound() {
        return "Buuuuu";
    }

    @Override
    public String toString() {
        return "Co povida kravka? Tohle: " + sound() + " a kolik ji je? Tolik: " + age;
    }

}
