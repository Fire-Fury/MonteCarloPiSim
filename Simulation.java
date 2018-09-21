
/**
 * Write a description of class Simulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Simulation
{
    private int pointsInCircle;
    private int totalPoints;
    private static float radius = 0.5f;
    private static Random r = new Random();
    
    public Simulation(){
        pointsInCircle = 0;
        totalPoints = 0;
    }
    
    public void addPoint(){    
        if(Math.pow(r.nextDouble() - radius,2) + Math.pow(r.nextDouble() - radius,2) <= radius*radius)
        {
            pointsInCircle++;
        }
        totalPoints++;
    }
    
    public void addTenThousandPoints(){
        for(int i = 0; i < 10000; i++){
            addPoint();
        }
    }
    
    public float getPiEstimation(){
        return 4*(((float)(pointsInCircle))/((float)(totalPoints)));
    }
    
    public int getPointsInCircle(){
        return pointsInCircle;
    }
    
    public int getTotalPoints(){
        return totalPoints;
    }
}
