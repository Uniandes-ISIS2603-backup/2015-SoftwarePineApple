package com.pineapple.eckotur.client.logic.api;

import com.pineapple.eckotur.client.logic.dto.BoughtDTO;
import com.pineapple.eckotur.client.logic.dto.BoughtPageDTO;
import java.util.List;

public interface IBoughtLogic {

        public BoughtDTO createBuy(BoughtDTO detail);
    
    public List<BoughtDTO> getBoughtByProvider(Long providerId, Long clientId);
    
    public List<BoughtDTO> getBoughtByTransaction(Long clientId, Long transactionId);
    
    public List<BoughtDTO> getBought(Long clientId);
    
    public BoughtDTO getBoughtByDate(Long ClientId, Integer Date );

    
    
    
}
