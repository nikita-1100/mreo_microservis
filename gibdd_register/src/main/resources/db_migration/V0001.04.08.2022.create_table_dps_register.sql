CREATE TABLE IF NOT EXISTS insurance_register(
                                                 id  INT8 PRIMARY KEY not null,
                                                 vin VARCHAR(17),
                                                 fine boolean,
                                                 fine_sum Integer,
                                                 banned boolean
);

create sequence dps_register_sequence;