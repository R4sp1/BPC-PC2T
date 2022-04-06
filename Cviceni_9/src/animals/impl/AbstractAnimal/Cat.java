package animals.impl.AbstractAnimal;

import animals.AbstractAnimal;


public class Cat extends AbstractAnimal {

    private byte age = 5;

    @Override
    public void setAge(byte age) {
        super.setAge(age);
    }

    @Override
    public String sound() {
        return "Mnau";
    }

    @Override
    public String toString() {
        return "Co povida kocka? Tohle: " + sound()  + " a kolik ji je? Tolik: " + age;
    }

}