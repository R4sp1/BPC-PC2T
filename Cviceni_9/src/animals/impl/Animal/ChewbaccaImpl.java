package animals.impl.Animal;

import animals.Animal;

public class ChewbaccaImpl implements Animal {
    private byte age;

    public ChewbaccaImpl(byte age) {
        super();
        this.age = age;
    }

    @Override
    public String sound() {
        return "GRAAAAWR";
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Co povida chewbacca? Tohle: " + sound() + " a kolik mu je? Tolik: " + age;
    }
}
