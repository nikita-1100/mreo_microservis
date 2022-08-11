create sequence owners_sequence;

CREATE TABLE IF NOT EXISTS owners(
                                                 id  INT8 PRIMARY KEY NOT NULL default nextval('owners_sequence'),
                                                 inn bigint,
                                                 name varchar(150),
                                                 owner_type varchar(50)
);

