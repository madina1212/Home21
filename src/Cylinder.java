public class Cylinder {
    private float radius;
    private float height;
    private float PI;

    public Cylinder(float radius, float height, float PI) {
        if (radius > 0 && radius < 20 && height > 0 && height < 20 && PI > 0 && PI < 20) {
            this.radius = radius;
            this.height = height;
            this.PI = PI;
        } else {
            throw new MyException();
        }
    }

    public Cylinder() {

    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getPI() {
        return PI;
    }

    public void setPI(float PI) {
        this.PI = PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", PI=" + PI +
                '}';
    }
    public double madina(){
        return 2*PI * radius*( height + radius);
    }
    public double kanush(){
        return  (PI*radius*radius*height);
    }
}
