create sequence vehicles_sequence;

CREATE TABLE IF NOT EXISTS vehicles(
                                     id  INT8 PRIMARY KEY NOT NULL default nextval('vehicles_sequence'),
                                     vin varchar(17),
                                     vehicle_type varchar(90)
                                   );

