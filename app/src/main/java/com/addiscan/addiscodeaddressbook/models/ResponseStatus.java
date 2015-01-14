package com.addiscan.addiscodeaddressbook.models;

import java.util.List;

/**
 * Created by Abdu on 1/14/2015.
 */
public class ResponseStatus {
    public String ErrorCode;
    public String Message;
    public String StackTrace;
    public List<Error> Errors;

    public String getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(String errorCode) {
        ErrorCode = errorCode;
    }

    public List<Error> getErrors() {
        return Errors;
    }

    public void setErrors(List<Error> errors) {
        Errors = errors;
    }

    public String getStackTrace() {
        return StackTrace;
    }

    public void setStackTrace(String stackTrace) {
        StackTrace = stackTrace;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public class Errors{
        public String ErrorCode;
        public String FieldName;
        public String Message;

        public String getErrorCode() {
            return ErrorCode;
        }

        public void setErrorCode(String errorCode) {
            ErrorCode = errorCode;
        }

        public String getFieldName() {
            return FieldName;
        }

        public void setFieldName(String fieldName) {
            FieldName = fieldName;
        }

        public String getMessage() {
            return Message;
        }

        public void setMessage(String message) {
            Message = message;
        }
    }
}
