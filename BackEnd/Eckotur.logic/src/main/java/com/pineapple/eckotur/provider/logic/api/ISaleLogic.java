package com.pineapple.eckotur.provider.logic.api;

import com.pineapple.eckotur.provider.logic.dto.SaleDTO;
import com.pineapple.eckotur.provider.logic.dto.SalePageDTO;
import java.util.List;

public interface ISaleLogic {
    
    public SaleDTO createSale(SaleDTO detail);
    
    public List<SaleDTO> getSalesByClient(Long providerId, Long clientId);
    
    public List<SaleDTO> getSalesByTransaction(Long providerId, Long transactionId);
    
    public SalePageDTO getSales(Long providerId, Integer page, Integer maxRecords);
    
    public SaleDTO getSale(Long id);
}
