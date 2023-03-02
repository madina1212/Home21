public class Parallelepiped {
    private float height;
    private float length;
    private float width;
    public Parallelepiped(float height, float length, float width) {
        if (height > 0 && height < 20 && length > 0 && length < 20 && width > 0 && width < 20) {
            this.height = height;
            this.length = length;
            this.width = width;
        } else {
            throw new MyException();
        }
    }

    public Parallelepiped() {

    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public double area() {
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    public double volume() {
        return (length * width * height);
    }
}
