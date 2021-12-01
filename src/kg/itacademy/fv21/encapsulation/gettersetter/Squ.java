package kg.itacademy.fv21.encapsulation.gettersetter;

public class Squ {
    private double side;
    private String color;
    public void setSide(double inputSide){
        side = inputSide;
    }

    public double getSide(){
        return side;
    }

    public double calculate(){
        return side * side;
    }

    public void setColor(String color1){
        color = color1;
    }

    public String getColor(){
        return color;
    }


}
