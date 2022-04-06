package animals.impl.Animal;

import animals.Animal;

public class CowImpl implements Animal {
    private byte age;

    public CowImpl(byte age) {
        super();
        this.age = age;
    }

    @Override
    public String sound() {
        return "Buuuu";
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Co povida kravka? Tohle: " + sound() + " a kolik ji je? Tolik: " + age;
    }
}
