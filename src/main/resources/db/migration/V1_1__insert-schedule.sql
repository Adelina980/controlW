insert into schedule(id, nclassroom, starttime, endTime, dayofweek, teacher, ngroup) values
    ((select nextval('schedule_seq')), 1409, '8:30', '10:30', 'fr', 'Kamil Shamilevech', '11-301');
