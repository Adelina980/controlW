create sequence schedule_seq;

create table schedule(id bigint primary key default nextval('schedule_seq'),
    nclassroom bigint,
    starttime character varying(100),
    endtime character varying(100),
    dayofweek character varying(100),
    teacher character varying(100),
    ngroup character varying(100)
);
