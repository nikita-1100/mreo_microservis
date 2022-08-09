CREATE TABLE IF NOT EXISTS insurance_register(
    id  INT8 PRIMARY KEY not null,
    vin VARCHAR(17),
    date_start date,
    date_end date
);

create sequence insurance_register_sequence;