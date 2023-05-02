package InheritanceDemo;

public class ChildClass extends ParentClass{
    private int age;

    public ChildClass(String complexion, int height, int size, int age) {
        super(complexion, height, size);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
