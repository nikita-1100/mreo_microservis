create sequence technical_inspection_register_sequence;

CREATE TABLE IF NOT EXISTS technical_inspection_register(
                                                 id  INT8 PRIMARY KEY NOT NULL default nextval('technical_inspection_register_sequence'),
                                                 vin VARCHAR(17),
                                                 date_end date,
                                                 sum int
);



