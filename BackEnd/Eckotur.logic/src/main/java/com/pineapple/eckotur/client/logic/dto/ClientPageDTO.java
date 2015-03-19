/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pineapple.eckotur.client.logic.dto;



import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement


public class ClientPageDTO {
  

    private Long totalRecords;

    private List<ClientDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<ClientDTO> getRecords() {
        return records;
    }

    public void setRecords(List<ClientDTO> records) {
        this.records = records;
    }
}

