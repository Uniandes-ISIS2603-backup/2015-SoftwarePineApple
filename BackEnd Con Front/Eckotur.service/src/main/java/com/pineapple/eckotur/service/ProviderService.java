package com.pineapple.eckotur.service;

import com.pineapple.eckotur.message.logic.dto.MessageDTO;
import com.pineapple.eckotur.news.logic.dto.NewsDTO;
import com.pineapple.eckotur.offer.logic.dto.OfferDTO;
import com.pineapple.eckotur.provider.logic.api.IProviderLogic;
import com.pineapple.eckotur.provider.logic.dto.ProviderDTO;
import com.pineapple.eckotur.provider.logic.dto.ProviderPageDTO;
import com.pineapple.eckotur.provider.logic.dto.SaleDTO;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/providers")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProviderService {

    @Inject
    protected IProviderLogic providerLogicService;

    @POST
    public ProviderDTO createProvider(ProviderDTO provider) {
        return providerLogicService.createProvider(provider);
    }

    @DELETE
    @Path("{id}")
    public void deleteProvider(@PathParam("id") Long id) {
        providerLogicService.deleteProvider(id);
    }

    @GET
    public ProviderPageDTO getProviders(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords) {
        return providerLogicService.getProviders(page, maxRecords);
    }

    @GET
    @Path("{id}")
    public ProviderDTO getProvider(@PathParam("id") Long id) {
        return providerLogicService.getProvider(id);
    }

    @PUT
    public void updateProvider(@PathParam("id") Long id, ProviderDTO provider) {
        providerLogicService.updateProvider(provider);
    }
    
    @GET
    @Path("{id}/offers")
    public List<OfferDTO> getProviderOffers(@PathParam("id") Long id){
        return providerLogicService.getProviderOffers(id);
    }
    
    @GET
    @Path("{id}/sales")
    public List<SaleDTO> getProviderSales(@PathParam("id") Long id){
        return providerLogicService.getProviderSales(id);
    }
            
    @GET
    @Path("{id}/news")
    public List<NewsDTO> getProviderNews(@PathParam("id") Long id){
        return providerLogicService.getProviderNews(id);
    }
    
    @GET
    @Path("{id}/messages")
    public List<MessageDTO> getProviderMessages(@PathParam("id") Long id){
        return providerLogicService.getProviderMessages(id);
    }
}