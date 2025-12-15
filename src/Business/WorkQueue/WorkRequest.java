/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

public abstract class WorkRequest {

    private String requestNote;
    private UserAccount requestSender;
    private UserAccount requestReceiver;
    private String requestStatus;
    private Date createdOn;
    private Date completedOn;
    private String diagnosticType = " ";

    public String getDiagnosticType() {
        return diagnosticType;
    }

    public void setDiagnosticType(String diagnosticType) {
        this.diagnosticType = diagnosticType;
    }

    public WorkRequest() {
        this.createdOn = new Date();
    }

    public String getRequestNote() {
        return requestNote;
    }

    public void setRequestNote(String requestNote) {
        this.requestNote = requestNote;
    }

    public UserAccount getRequestSender() {
        return requestSender;
    }

    public void setRequestSender(UserAccount requestSender) {
        this.requestSender = requestSender;
    }

    public UserAccount getRequestReceiver() {
        return requestReceiver;
    }

    public void setRequestReceiver(UserAccount requestReceiver) {
        this.requestReceiver = requestReceiver;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getCompletedOn() {
        return completedOn;
    }

    public void setCompletedOn(Date completedOn) {
        this.completedOn = completedOn;
    }
}
