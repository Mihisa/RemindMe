package com.mihisa.remindme.dto;

import org.w3c.dom.ProcessingInstruction;

/**
 * Created by insight on 02.09.17.
 */

public class RemindDTO {

    private String title;

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
