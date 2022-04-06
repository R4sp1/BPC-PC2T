package animals;

public abstract class AbstractAnimal {

    protected byte age;

    public AbstractAnimal() {
    }

    public abstract String sound();

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

}
