package com.example.mobifonev2.Logging;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "FGA_LOG")
public class Logging {

    @Id
    private Integer id;
    private String fileId;
    private Date timeInsert;
    private String dbName;
    private Date dateTime;
    private String dbUser;
    private String osUser;
    @Column(name = "USERHOST")
    private String userHost;
    private String clientId;
    private String objectSchema;
    private String objectName;
    private String policyName;
    private String sqlText;
    private String statementType;
    private String sqlBind;
    private Integer rowNum;

    public Logging() {
    }

    public Logging(Integer id, String fileId, Date timeInsert, String dbName, Date dateTime, String dbUser, String osUser, String userHost, String clientId, String objectSchema, String objectName, String policyName, String sqlText, String statementType, String sqlBind, Integer rowNum) {
        this.id = id;
        this.fileId = fileId;
        this.timeInsert = timeInsert;
        this.dbName = dbName;
        this.dateTime = dateTime;
        this.dbUser = dbUser;
        this.osUser = osUser;
        this.userHost = userHost;
        this.clientId = clientId;
        this.objectSchema = objectSchema;
        this.objectName = objectName;
        this.policyName = policyName;
        this.sqlText = sqlText;
        this.statementType = statementType;
        this.sqlBind = sqlBind;
        this.rowNum = rowNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Date getTimeInsert() {
        return timeInsert;
    }

    public void setTimeInsert(Date timeInsert) {
        this.timeInsert = timeInsert;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getOsUser() {
        return osUser;
    }

    public void setOsUser(String osUser) {
        this.osUser = osUser;
    }

    public String getuserHost() {
        return userHost;
    }

    public void setuserHost(String userHost) {
        this.userHost = userHost;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    public String getStatementType() {
        return statementType;
    }

    public void setStatementType(String statementType) {
        this.statementType = statementType;
    }

    public String getSqlBind() {
        return sqlBind;
    }

    public void setSqlBind(String sqlBind) {
        this.sqlBind = sqlBind;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }
}
