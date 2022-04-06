package animals.impl.Animal;

import animals.Animal;

public class PigImpl implements Animal {
    private byte age;

    public PigImpl(byte age) {
        super();
        this.age = age;
    }

    @Override
    public String sound() {
        return "Chro Chro";
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Co povida prase? Tohle: " + sound() + " a kolik mu je? Tolik: " + age;
    }
}
