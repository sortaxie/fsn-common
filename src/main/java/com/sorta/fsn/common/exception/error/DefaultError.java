package com.sorta.fsn.common.exception.error;

/**
 * @author benju.xie
 * @version 0.0.1
 * @datetime 2017/5/10 17:58
 */
public enum DefaultError implements IError {
    SYSTEM_INTERNAL_ERROR("0000", "System Internal Error"),

    TOKEN_NOT_FOUND("0001", "Token Not Found"),
    INVALID_TOKEN("0002", "Invalid Token"),
    SIGN_NOT_FOUND("0003", "Sign Not Found"),
    INVALID_SIGN("0004", "Invalid Sign"),
    SERVICE_NOT_FOUND("0005", "Service Not Found"),

    CREATE_TOKEN_FAILED("0006", "Create token failed"),
    PARAMETER_MAX_LENGTH("0007", "Parameter max length limit"),
    PARAMETER_MIN_LENGTH("0008", "Parameter min length limit"),
    PARAMETER_ANNOTATION_NOT_MATCH("0009", "Parameter annotation not match"),
    PARAMETER_NOT_MATCH_RULE("0010", "Parameter not match validation rule");

    String errorCode;
    String errorMessage;
    String zh_errorMessage;
    private static final String ns = "SYS";

    private DefaultError(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    private DefaultError(String errorCode, String errorMessage, String zh_errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getNamespace() {
        return "SYS";
    }

    public String getErrorCode() {
        return "SYS." + this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getZh_errorMessage() {
        return this.zh_errorMessage;
    }
}