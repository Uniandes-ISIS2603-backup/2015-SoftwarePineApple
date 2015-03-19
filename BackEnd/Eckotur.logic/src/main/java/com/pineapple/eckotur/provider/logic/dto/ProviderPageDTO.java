package com.pineapple.eckotur.provider.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProviderPageDTO{

    private Long totalRecords;

    private List<ProviderDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<ProviderDTO> getRecords() {
        return records;
    }

    public void setRecords(List<ProviderDTO> records) {
        this.records = records;
    }
}
