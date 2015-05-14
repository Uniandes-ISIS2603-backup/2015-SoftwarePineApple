package com.pineapple.eckotur.offer.logic.api;

import com.pineapple.eckotur.offer.logic.dto.OfferDTO;
import com.pineapple.eckotur.offer.logic.dto.OfferPageDTO;
import java.util.List;

public interface IOfferLogic {

    public List<OfferDTO> getOffers();

    public OfferPageDTO getOffers(Integer page, Integer maxRecords);

    public OfferDTO getOffer(Long id);
    
    public OfferDTO createOffer(OfferDTO offer);

    public void deleteOffer(Long id);
    
    public void updateOffer(OfferDTO offer);
}

