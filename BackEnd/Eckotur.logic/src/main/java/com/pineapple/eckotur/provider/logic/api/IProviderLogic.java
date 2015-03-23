package com.pineapple.eckotur.provider.logic.api;

import com.pineapple.eckotur.message.logic.dto.MessageDTO;
import com.pineapple.eckotur.news.logic.dto.NewsDTO;
import com.pineapple.eckotur.offer.logic.dto.OfferDTO;
import com.pineapple.eckotur.provider.logic.dto.ProviderDTO;
import com.pineapple.eckotur.provider.logic.dto.ProviderPageDTO;
import com.pineapple.eckotur.provider.logic.dto.SaleDTO;
import java.util.List;

public interface IProviderLogic {

    public ProviderDTO createProvider(ProviderDTO detail);

    public List<ProviderDTO> getProviders();

    public ProviderPageDTO getProviders(Integer page, Integer maxRecords);

    public ProviderDTO getProvider(Long id);

    public void deleteProvider(Long id);

    public void updateProvider(ProviderDTO detail);
    
    public List<OfferDTO> getProviderOffers(Long id);
    
    public List<SaleDTO> getProviderSales(Long id);
    
    public List<NewsDTO> getProviderNews(Long id);
    
    public List<MessageDTO> getProviderMessages(Long id);
}
