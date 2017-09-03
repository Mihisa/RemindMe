package com.mihisa.remindme.dto;

import org.w3c.dom.ProcessingInstruction;

import java.util.Date;

/**
 * Created by insight on 02.09.17.
 */

public class RemindDTO {

    private String id;
    private String title;
    private Date remindDate;

    public RemindDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
