package com.campus.reto2.calculadora.web.excepciones;
import java.util.Objects;

public class ErrorResponses {
    
    private String error;
    private String message;


    public ErrorResponses() {
    }

    public ErrorResponses(String error, String message) {
        this.error = error;
        this.message = message;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorResponses error(String error) {
        setError(error);
        return this;
    }

    public ErrorResponses message(String message) {
        setMessage(message);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ErrorResponses)) {
            return false;
        }
        ErrorResponses errorResponses = (ErrorResponses) o;
        return Objects.equals(error, errorResponses.error) && Objects.equals(message, errorResponses.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, message);
    }

    @Override
    public String toString() {
        return "{" +
            " error='" + getError() + "'" +
            ", message='" + getMessage() + "'" +
            "}";
    }
    
}
