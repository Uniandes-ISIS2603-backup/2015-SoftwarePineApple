package com.pineapple.eckotur.provider.logic.api;

import com.pineapple.eckotur.provider.logic.dto.SaleDTO;
import java.util.List;

public interface ISaleLogic {
    
    public SaleDTO createSale(SaleDTO detail);
    
    public List<SaleDTO> getSalesByClient(Long providerId, Long clientId);
    
    public List<SaleDTO> getSalesByTransaction(Long providerId, Long transactionId);
    
    public List<SaleDTO> getSales(Long providerId);
    
    public SaleDTO getSale(Long id);
}
