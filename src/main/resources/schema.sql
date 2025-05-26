CREATE TABLE schools(
    school_id   INTEGER AUTO_INCREMENT PRIMARY KEY,
    school_name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    tel VARCHAR(255) NOT NULL,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE departments(
    department_id   INTEGER AUTO_INCREMENT PRIMARY KEY,
    department_name VARCHAR(255) NOT NULL,
    years INTEGER  NOT NULL,
    school_id INTEGER NOT NULL,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (school_id) REFERENCES schools(school_id) on delete CASCADE
);