package InheritanceDemo;

public class ParentClass {

    private String complexion;
    private double height;
    private int size;

    public ParentClass(String complexion, double height, int size) {
        this.complexion = complexion;
        this.height = height;
        this.size = size;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
