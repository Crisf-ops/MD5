package model;

public class DateToken {
    String applicationCode ;
    String applicationKey;
    String transactionId;
    String userId;

    public DateToken(String applicationCode, String applicationKey, String transactionId, String userId) {
        this.applicationCode = applicationCode;
        this.applicationKey = applicationKey;
        this.transactionId = transactionId;
        this.userId = userId;
    }

    public String getApplicationCode() { return applicationCode; }

    public void setApplicationCode(String applicationCode) { this.applicationCode = applicationCode; }

    public String getApplicationKey() { return applicationKey; }

    public void setApplicationKey(String applicationKey) { this.applicationKey = applicationKey; }

    public String getTransactionId() { return transactionId; }

    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public String getUserId() { return userId; }

    public void setUserId(String userId) { this.userId = userId; }
}
