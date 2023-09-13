package src.tsp;
public class City {
    private int x;
    private int y;
    private final String name;
    public City(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public double measureDistance (City city){
        double deltaX = city.getX() - this.getX();
        double deltaY = city.getY() - this.getY();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
    @Override
    public String toString() {
        return this.getName();
    }
    public int getX(){return x;}
    public int getY(){return y;}
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String getName(){
        return name;
    }
}
