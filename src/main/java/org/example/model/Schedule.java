package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Schedule {
    Long id;
    int nclassroom;
    String starttime;
    String endtime;
    String dayofweek;
    String teacher;
    String ngroup;

    public Schedule(long id, int nClassroom, String starttime, String endtime, String dayofweek, String teacher, String ngroup) {
        this.id = id;
        this.nclassroom = nClassroom;
        this.starttime = starttime;
        this.endtime = endtime;
        this.dayofweek = dayofweek;
        this.teacher = teacher;
        this.ngroup = ngroup;
    }
}

