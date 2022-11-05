package dio.web.api.handler;

import java.time.LocalDateTime;

public class ResponseError{
    
    LocalDateTime timestamp = LocalDateTime.now();
    //private Date timestamp = new Date();
    private String status = "error";
    private int statusCode = 400;
    private String error;


    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    
}