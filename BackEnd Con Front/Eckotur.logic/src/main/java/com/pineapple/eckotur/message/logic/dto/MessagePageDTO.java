package com.pineapple.eckotur.message.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessagePageDTO{

    private Long totalRecords;

    private List<MessageDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<MessageDTO> getRecords() {
        return records;
    }

    public void setRecords(List<MessageDTO> records) {
        this.records = records;
    }
}
