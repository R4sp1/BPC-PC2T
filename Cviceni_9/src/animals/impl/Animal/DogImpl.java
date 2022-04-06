package animals.impl.Animal;

import animals.Animal;

public class DogImpl implements Animal {
    private byte age;

    public DogImpl(byte age) {
        super();
        this.age = age;
    }

    @Override
    public String sound() {
        return "Haf";
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Co povida pes? Tohle: " + sound() + " a kolik mu je? Tolik: " + age;
    }
}
