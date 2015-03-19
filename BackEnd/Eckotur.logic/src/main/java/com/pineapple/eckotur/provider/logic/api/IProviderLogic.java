package com.pineapple.eckotur.provider.logic.api;

import com.pineapple.eckotur.provider.logic.dto.ProviderDTO;
import com.pineapple.eckotur.provider.logic.dto.ProviderPageDTO;
import java.util.List;

public interface IProviderLogic {

    public ProviderDTO createProvider(ProviderDTO detail);

    public List<ProviderDTO> getProviders();

    public ProviderPageDTO getProviders(Integer page, Integer maxRecords);

    public ProviderDTO getProvider(Long id);

    public void deleteProvider(Long id);

    public void updateProvider(ProviderDTO detail);
}
