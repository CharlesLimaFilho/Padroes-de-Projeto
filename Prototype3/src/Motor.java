public class Motor implements Prototype {
    private String type;

    public Motor(String type) {
        this.type = type;
    }

    public Motor(Motor target) {
        if (target != null) {
            this.type = target.type;
        }
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Prototype clone() {
        return new Motor(this);
    }
}
