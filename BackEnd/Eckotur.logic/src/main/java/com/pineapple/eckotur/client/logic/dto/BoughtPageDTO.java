/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pineapple.eckotur.client.logic.dto;

/**
 *
 * @author estudiante
 */
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

public class BoughtPageDTO {

    private Long totalRecords;

    private List<BoughtDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<BoughtDTO> getRecords() {
        return records;
    }

    public void setRecords(List<BoughtDTO> records) {
        this.records = records;
    }
}

