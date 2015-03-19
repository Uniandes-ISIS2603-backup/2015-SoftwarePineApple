package com.pineapple.eckotur.provider.logic.api;

import com.pineapple.eckotur.provider.logic.dto.SaleDTO;
import com.pineapple.eckotur.provider.logic.dto.SalePageDTO;
import java.util.List;

public interface ISaleLogic {
    
    public SaleDTO createSale(SaleDTO sale);
    
    public List<SaleDTO> getSalesByClient(Long sellerId, Long clientId);
    
    public List<SaleDTO> getSalesByTransaction(Long sellerId, Long transactionId);
    
    public SalePageDTO getSales(Long sellerId, Integer page, Integer maxRecords);
    
    public SaleDTO getSale(Long id);
}
