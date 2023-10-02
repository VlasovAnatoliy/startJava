\c robots;

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers (
    id SERIAL PRIMARY KEY,
    model_name VARCHAR(50),
    mark VARCHAR(10),
    height REAL,
    weight NUMERIC,
    status VARCHAR(20),
    origin VARCHAR(50),
    launch DATE,
    kaiju_kill INT
);

\ir 'init_db.sql'
\ir 'queries.sql'