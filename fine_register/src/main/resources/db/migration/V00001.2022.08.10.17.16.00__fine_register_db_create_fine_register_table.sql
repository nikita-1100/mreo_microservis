create sequence fine_register_sequence;

CREATE TABLE IF NOT EXISTS fine_register(
                                                 id  INT8 PRIMARY KEY NOT NULL default nextval('fine_register_sequence'),
                                                 vin VARCHAR(17),
                                                 sum int
);

