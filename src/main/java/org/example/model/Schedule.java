package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Schedule {
    Long id;
    int nclassroom;
    String starttime;
    String endTime;
    String dayofweek;
    String teacher;
    String ngroup;

    public Schedule(long id, int nClassroom, String starttime, String endTime, String dayofweek, String teacher, String ngroup) {
        this.id = id;
        this.nclassroom = nClassroom;
        this.starttime = starttime;
        this.endTime = endTime;
        this.dayofweek = dayofweek;
        this.teacher = teacher;
        this.ngroup = ngroup;
    }
}

