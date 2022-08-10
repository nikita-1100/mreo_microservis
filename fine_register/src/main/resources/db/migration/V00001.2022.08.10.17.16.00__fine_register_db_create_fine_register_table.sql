CREATE TABLE IF NOT EXISTS fine_register(
                                                 id  INT8 PRIMARY KEY not null,
                                                 vin VARCHAR(17),
                                                 sum int
);

create sequence fine_register_sequence;