-- Create table person
CREATE TABLE person (
    id SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL,
    surname VARCHAR NOT NULL,
    document BIGINT NOT NULL,
    age SMALLINT NOT NULL,
    phone BIGINT NOT NULL
);

-- Create table doctor
CREATE TABLE doctor (
    id SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL,
    surname VARCHAR NOT NULL,
    office VARCHAR NOT NULL,
    email VARCHAR NOT NULL,
    specialty VARCHAR NOT NULL
);

-- Create table appointments
CREATE TABLE appointments (
    id SERIAL PRIMARY KEY,
    specialty VARCHAR NOT NULL,
    person_document BIGINT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (person_document) REFERENCES person (document)
);

-- Create table specialty
CREATE TABLE specialty (
    id SERIAL PRIMARY KEY,
    specialty_name VARCHAR NOT NULL
);

-- Add constraints and modify columns

-- Alter table person
ALTER TABLE person ALTER COLUMN document SET NOT NULL;
ALTER TABLE person ALTER COLUMN document TYPE BIGINT USING document::BIGINT;
ALTER TABLE person ALTER COLUMN phone SET NOT NULL;
ALTER TABLE person ALTER COLUMN phone TYPE BIGINT USING phone::BIGINT;

-- Alter table doctor
ALTER TABLE doctor ADD COLUMN document BIGINT NOT NULL;
ALTER TABLE doctor ADD COLUMN age SMALLINT NOT NULL;
ALTER TABLE doctor ADD COLUMN phone BIGINT NOT NULL;
ALTER TABLE doctor DROP COLUMN age;
ALTER TABLE doctor DROP COLUMN phone;

-- Alter table appointments
ALTER TABLE appointments ADD COLUMN person_id INTEGER NOT NULL;
ALTER TABLE appointments ALTER COLUMN person_document DROP NOT NULL;
ALTER TABLE appointments ALTER COLUMN person_document TYPE BIGINT USING person_document::BIGINT;
ALTER TABLE appointments ADD CONSTRAINT fk_appointments_person FOREIGN KEY (person_id) REFERENCES person (id);
ALTER TABLE appointments DROP COLUMN person_document;

-- Alter table specialty
ALTER TABLE specialty ALTER COLUMN specialty_name SET NOT NULL;
