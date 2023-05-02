package InheritanceDemo;

public class ClassTest {
    public static void main(String[] args) {
        ChildClass childClass=new ChildClass("fair", 11,24,30);

        System.out.printf("""
                The child attributes are,
                Complexion is %S,
                Height is %s
                size is %s
                Age is %s\s""",
                childClass.getComplexion(),childClass.getHeight(),childClass.getSize(),childClass.getAge());
    }
}
