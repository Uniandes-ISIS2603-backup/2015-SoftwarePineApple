package com.pineapple.eckotur.client.logic.api;

import com.pineapple.eckotur.client.logic.dto.ClientDTO;
import com.pineapple.eckotur.client.logic.dto.ClientPageDTO;
import java.util.List;

public interface IClientLogic {

    public ClientDTO createClient(ClientDTO detail);//

    public List<ClientDTO> getClients();//

    public ClientPageDTO getClients(Integer page, Integer maxRecords);//

    public ClientDTO getClient(Long id);

    public void deleteClient(Long id);

    public void updateClient(ClientDTO detail);
}
