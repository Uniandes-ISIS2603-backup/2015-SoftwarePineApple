package co.edu.uniandes.csw.SportGroup.country.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CountryPageDTO {
    private Long totalRecords;

    private List<CountryDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<CountryDTO> getRecords() {
        return records;
    }

    public void setRecords(List<CountryDTO> records) {
        this.records = records;
    }
}
