CREATE TABLE IF NOT EXISTS insurance_register(
    id  INT8 PRIMARY KEY not null,
    vin VARCHAR(17),
    date_start date,
    date_end date,
    number_plate VARCHAR(10)
);

create sequence insurance_register_sequence;