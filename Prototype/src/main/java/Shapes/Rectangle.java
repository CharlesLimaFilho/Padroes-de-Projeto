package Shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.height = target.height;
            this.width = target.width;
        }
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle) || !super.equals(o)) return false;
        Rectangle rectangle2 = (Rectangle) o;
        return rectangle2.height == height && rectangle2.width == width;
    }
}
