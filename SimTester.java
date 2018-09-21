public class SimTester{
    public static void main(String[] args){
        Simulation s = new Simulation();
        s.addNPoints(10000000);
        
        System.out.println(s.getPiEstimation());
        System.out.println(s.getPointsInCircle());
        System.out.println(s.getTotalPoints());
    }
}