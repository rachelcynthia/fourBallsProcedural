import processing.core.PApplet;

public class fourBallsChallenge extends PApplet {

    public static final int DIAMETER = 15;
    int xAxisCircleOne = 0;
    int yAxisCircleOne = 50;
    int xAxisCircleTwo = 0;
    int yAxisCircleTwo = 150;
    int xAxisCircleThree = 0;
    int yAxisCircleThree = 250;
    int xAxisCircleFour = 0;
    int yAxisCircleFour = 350;

    public static void main(String[] args){
        PApplet.main("fourBallsChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(800,420);
    }

    @Override
    public void draw() {
        drawCircleOne();
        drawCircleTwo();
        drawCircleThree();
        drawCircleFour();
    }

    private void drawCircleFour() {
        ellipse(xAxisCircleFour, yAxisCircleFour,DIAMETER,DIAMETER);
        xAxisCircleFour+=4;
    }

    private void drawCircleThree() {
        ellipse(xAxisCircleThree, yAxisCircleThree,DIAMETER,DIAMETER);
        xAxisCircleThree+=3;
    }

    private void drawCircleTwo() {
        ellipse(xAxisCircleTwo, yAxisCircleTwo, DIAMETER,DIAMETER);
        xAxisCircleTwo+=2;
    }

    private void drawCircleOne() {
        ellipse(xAxisCircleOne, yAxisCircleOne, DIAMETER,DIAMETER);
        xAxisCircleOne++;
    }
}
