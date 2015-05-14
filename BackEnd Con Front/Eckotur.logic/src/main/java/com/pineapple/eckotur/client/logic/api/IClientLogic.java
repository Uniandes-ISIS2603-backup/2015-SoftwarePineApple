package com.pineapple.eckotur.client.logic.api;

import com.pineapple.eckotur.client.logic.dto.CartDTO;
import com.pineapple.eckotur.client.logic.dto.ClientDTO;
import com.pineapple.eckotur.client.logic.dto.ClientPageDTO;
import com.pineapple.eckotur.offer.logic.dto.OfferDTO;
import com.pineapple.eckotur.offer.logic.dto.OfferPageDTO;
import java.util.List;

public interface IClientLogic 
{

    public ClientDTO createClient(ClientDTO detail);//

    public List<ClientDTO> getClients();//

    public ClientPageDTO getClients(Integer page, Integer maxRecords);//

    public ClientDTO getClient(Long id);

    public void deleteClient(Long id);

    public void updateClient(ClientDTO detail);
    
    public OfferPageDTO  getCart (Long id);
    
    
    public CartDTO addToCart( CartDTO cart);
    
    public OfferDTO getOfferInCart( Long idClient, Long idOffer);
    
    public void emptyCart(Long idClient);
    
    public CartDTO deleteOfferInCart( CartDTO cart) ;
}
