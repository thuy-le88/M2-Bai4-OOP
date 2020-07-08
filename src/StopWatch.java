import java.time.LocalTime;

public class StopWatch {
    LocalTime startTime;
    LocalTime endTime;
    public StopWatch() {
    }
    public StopWatch(LocalTime startTime,LocalTime endTime) {
        this.startTime=startTime;
        this.endTime=endTime;
    }
    public LocalTime getterStartTime() {
        return this.startTime;
    }
    public LocalTime getterEndtime() {
        return this.endTime;
    }
    public void start() {
        this.startTime = LocalTime.now();
        getterStartTime();
    }
    public void end() {
        this.endTime=LocalTime.now();
        getterEndtime();
    }
    public long getElapsedTime() {
        long elapsedTime;
        elapsedTime=(endTime.toSecondOfDay()-startTime.toSecondOfDay())*100;
        return elapsedTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        int sum=0;
        for (int i=100;i<100000000;i++) {
            sum+=i;
        }
        stopWatch.end();
        System.out.println("counted "+stopWatch.getElapsedTime());
    }

}
