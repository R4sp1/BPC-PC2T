package animals.impl.Animal;


import animals.Animal;

public class GoatImpl implements Animal {
    private byte age;

    public GoatImpl(byte age) {
        super();
        this.age = age;
    }

    @Override
    public String sound() {
        return "Mee";
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Co povida koza? Tohle: " + sound() + " a kolik ji je? Tolik: " + age;
    }
}
