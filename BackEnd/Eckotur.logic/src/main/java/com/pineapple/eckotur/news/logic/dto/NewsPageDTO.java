package com.pineapple.eckotur.news.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NewsPageDTO{

    private Long totalRecords;

    private List<NewsDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<NewsDTO> getRecords() {
        return records;
    }

    public void setRecords(List<NewsDTO> records) {
        this.records = records;
    }
}
