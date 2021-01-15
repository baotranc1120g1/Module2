public class MoveablePoint extends Point {
    private float xSpeed,ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public MoveablePoint() {

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[] {this.xSpeed,this.ySpeed};
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() +")" + "," + "speed" + "=" + "(" + this.xSpeed + "," + this.ySpeed + ")";
    }

    public MoveablePoint move() {
        float x = super.getX() + xSpeed;
        float y = super.getY() + ySpeed;
        super.setX(x);
        super.setY(y);
        return this;
    }
}
