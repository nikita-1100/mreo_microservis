create sequence insurance_register_sequence;

CREATE TABLE IF NOT EXISTS insurance_register(
    id  INT8 PRIMARY KEY NOT NULL default nextval('insurance_register_sequence'),
    vin VARCHAR(17),
    date_start date,
    date_end date
);
