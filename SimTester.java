public class SimTester{
    public static void main(String[] args){
        Simulation s = new Simulation();
        s.addTenThousandPoints();
        s.addTenThousandPoints();
        s.addTenThousandPoints();
        
        System.out.println(s.getPiEstimation());
        System.out.println(s.getPointsInCircle());
        System.out.println(s.getTotalPoints());
    }
}