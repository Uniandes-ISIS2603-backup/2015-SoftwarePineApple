package co.edu.uniandes.csw.SportGroup.sale.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SalePageDTO {
    private Long totalRecords;

    private List<SaleDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<SaleDTO> getRecords() {
        return records;
    }

    public void setRecords(List<SaleDTO> records) {
        this.records = records;
    }
}
