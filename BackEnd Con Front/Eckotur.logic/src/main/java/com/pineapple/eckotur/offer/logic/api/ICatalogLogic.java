package com.pineapple.eckotur.offer.logic.api;

import com.pineapple.eckotur.offer.logic.dto.OfferDTO;
import com.pineapple.eckotur.offer.logic.dto.OfferPageDTO;
import java.util.List;

public interface ICatalogLogic {

    public List<OfferDTO> getOffers();

    public OfferPageDTO getOffers(Integer page, Integer maxRecords);

    public OfferDTO getOffer(Long id);

}
