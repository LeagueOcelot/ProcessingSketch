import processing.core.PApplet;

public class MyClass extends PApplet{

    @Override
    public void settings() {
        
    }

    @Override
    public void draw() {
        
    }

    public static void main (String[] args) {
        MyClass pt = new MyClass();
        PApplet.runSketch(new String[]{"ProcessingTest"}, pt);
    }
}