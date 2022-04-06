package animals.impl.Animal;

import animals.Animal;


public class CatImpl implements Animal {
    private byte age;

    public CatImpl(byte age) {
        this.age = age;
    }

    @Override
    public String sound() {
        return "Mnau";
    }


    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Co povida kocka? Tohle: " + sound() + " a kolik ji je? Tolik: " + age;
    }
}
