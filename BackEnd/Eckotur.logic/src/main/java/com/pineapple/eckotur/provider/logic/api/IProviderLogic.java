package com.pineapple.eckotur.provider.logic.api;

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
    
    public List<OfferDTO> getProviderOffers(Integer page, Integer maxRecords);
    
    public List<SaleDTO> getProviderOffers(Integer page, Integer maxRecords);
    
    public List<NewsDTO> getProviderOffers(Integer page, Integer maxRecords);
    
    public List<MessageDTO> getProviderOffers(Integer page, Integer maxRecords);
    
    public List<ReportDTO> getProviderOffers(Integer page, Integer maxRecords);
    
    public List<OfferDTO> getProviderOffers(Integer page, Integer maxRecords);
}
