/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.SportGroup.sale.logic.api;

import co.edu.uniandes.csw.SportGroup.sale.logic.dto.SaleDTO;
import co.edu.uniandes.csw.SportGroup.sale.logic.dto.SalePageDTO;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public interface ISaleLogic {

    public SaleDTO createSale(SaleDTO detail);

    public List<SaleDTO> getSales();

    public SalePageDTO getSales(Integer page, Integer maxRecords);

    public SaleDTO getSale(Long id);

    public void deleteSale(Long id);

    public void updateSale(SaleDTO detail);
    
}
