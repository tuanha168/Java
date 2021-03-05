public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
        else
            throw new IllegalArgumentException("Invalid Hour");
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
        else
            throw new IllegalArgumentException("Invalid Minute");
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        }
        else
            throw new IllegalArgumentException("Invalid Second");
    }

    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public Time nextSecond() {
        ++this.second;
        if (this.second >= 60)
        {
            this.second = 0;
            ++this.minute;
            if (this.minute >= 60)
            {
                this.minute = 0;
                ++this.hour;
                if (this.hour >= 24)
                {
                    this.hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        --this.second;
        if (this.second < 0)
        {
            this.second = 0;
            --this.minute;
            if (this.minute < 0)
            {
                this.minute = 0;
                --this.hour;
                if (this.hour < 0)
                {
                    this.hour = 23;
                }
            }
        }
        return this;
    }
}