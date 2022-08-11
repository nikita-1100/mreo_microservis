create sequence gibdd_register_sequence;

CREATE TABLE IF NOT EXISTS gibdd_register(
                    id  INT8 PRIMARY KEY NOT NULL default nextval('gibdd_register_sequence'),
                    number_plate VARCHAR(12),
                    owner_id INT8,
                    vehicle_id INT8,
                    FOREIGN KEY (owner_id) REFERENCES owners (id) ON DELETE SET NULL,
                    FOREIGN KEY (vehicle_id) REFERENCES vehicles (id) ON DELETE SET NULL
);
