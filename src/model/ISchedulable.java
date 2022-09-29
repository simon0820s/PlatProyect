package model;

import java.util.Date;

public interface ISchedulable{
    abstract void schedule(Date date, String time);
}
