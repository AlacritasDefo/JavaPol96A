package liczymyCzas;

public class Display {
    private int hours;
    private int minutes;
    private int seconds;

    public Display (int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public void plusSeconds (int addSeconds){
        seconds += addSeconds;
        if (seconds < 60)
            return;
        int addMinutes = seconds/60;
        seconds = seconds % 60;
        minutes += addMinutes;
        if(minutes < 60)
            return;
        int addHours = minutes/60;
        minutes = minutes % 60;
        hours += addHours;
        hours = hours % 24;
    }
    @Override
    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }
}
