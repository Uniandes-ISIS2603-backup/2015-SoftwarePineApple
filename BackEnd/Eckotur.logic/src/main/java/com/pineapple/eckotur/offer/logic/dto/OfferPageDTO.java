package com.pineapple.eckotur.offer.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OfferPageDTO{

    private Long totalRecords;

    private List<OfferDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<OfferDTO> getRecords() {
        return records;
    }

    public void setRecords(List<OfferDTO> records) {
        this.records = records;
    }
}
