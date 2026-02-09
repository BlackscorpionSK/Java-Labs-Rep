
public class MyTime {

    private int hour;
    private int minute;
    private int second;

    public MyTime()
    {
        long currentTimeMillis = System.currentTimeMillis();
        setTime(currentTimeMillis);
    }

    public MyTime(long elapseTime)
    {
        setTime(elapseTime);
    }

    public MyTime(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour()
    {
        this.hour = hour;
        return hour;
    }
    public int getMinute()
    {
        this.minute = minute;
        return minute;
    }
    public int getSecond()
    {
        this.second = second;
        return second;
    }

    public void setTime(long elapseTime)
    {
        long totalSeconds = elapseTime / 1000;
        this.second = (int) totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        this.minute = (int) totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        this.hour = (int) totalHours % 24;
    }

}