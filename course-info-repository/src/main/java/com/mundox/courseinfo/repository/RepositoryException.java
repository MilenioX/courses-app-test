package com.mundox.courseinfo.repository;

import java.sql.SQLException;

public class RepositoryException extends RuntimeException {
    public RepositoryException(String message, SQLException exception) {
        super(message, exception);
    }
}
