package secao8.entities;

public class Rectangle {
    public double width; // altura
    public double height; //largura

    public double area(){
        return width * height;
    }

    public double perimeter(){
       return 2 * (height+width);
    }

    public double diagonal(){
        return Math.sqrt(width * width + height * height);
    }
}
