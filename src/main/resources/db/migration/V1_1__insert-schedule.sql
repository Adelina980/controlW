insert into schedule(id, nclassroom, starttime, endtime, dayofweek, teacher, ngroup) values
    ((select nextval('schedule_seq')), 1409, '8:30', '10:30', 'fr', 'Kamil Shamilevech', '11-301'),
    ((select nextval('schedule_seq')), 1201, '9:00', '11:00', 'mon', 'Elena Petrova', '11-202'),
    ((select nextval('schedule_seq')), 1410, '10:00', '12:00', 'tues', 'Ivan Petrov', '11-302'),
    ((select nextval('schedule_seq')), 1408, '11:30', '13:30', 'weds', 'Maria Ivanova', '11-201'),
    ((select nextval('schedule_seq')), 1202, '14:00', '16:00', 'thurs', 'Sergey Smirnov', '11-303'),
    ((select nextval('schedule_seq')), 1407, '15:00', '17:00', 'fr', 'Olga Petrova', '11-203'),
    ((select nextval('schedule_seq')), 1203, '16:30', '18:30', 'mon', 'Dmitry Ivanov', '11-304'),
    ((select nextval('schedule_seq')), 1411, '9:15', '11:15', 'weds', 'Maxim Sidorov', '11-204'),
    ((select nextval('schedule_seq')), 1406, '10:45', '12:45', 'thurs', 'Anastasia Petrova', '11-305'),
    ((select nextval('schedule_seq')), 1301, '14:15', '16:15', 'mon', 'Alexey Ivanov', '11-101');




