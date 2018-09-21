
/**
 * Write a description of class Simulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Simulation
{
    private long pointsInCircle;
    private long totalPoints;
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
    
    public void addNPoints(int n){
        for(int i = 0; i < n; i++){
            addPoint();
        }
    }
    
    public double getPiEstimation(){
        return 4*((double)pointsInCircle)/((double)totalPoints);
    }
    
    public long getPointsInCircle(){
        return pointsInCircle;
    }
    
    public long getTotalPoints(){
        return totalPoints;
    }
}
