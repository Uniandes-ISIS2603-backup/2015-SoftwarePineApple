package com.pineapple.eckotur.service;
import com.pineapple.eckotur.client.logic.api.ICartLogic;
import com.pineapple.eckotur.client.logic.api.IClientLogic;
import com.pineapple.eckotur.client.logic.dto.CartDTO;
import com.pineapple.eckotur.client.logic.dto.ClientDTO;
import com.pineapple.eckotur.client.logic.dto.ClientPageDTO;
import com.pineapple.eckotur.offer.logic.dto.OfferDTO;
import com.pineapple.eckotur.offer.logic.dto.OfferPageDTO;
import java.io.Console;
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

@Path("/Client")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClientService {

    @Inject
    protected IClientLogic clientLogicService;
    protected ICartLogic cartLogicService;

    @POST
    public ClientDTO createClient(ClientDTO client) {
        return clientLogicService.createClient(client);
    }

    @DELETE
    @Path("{id}")
    public void deleteclient(@PathParam("id") Long id) {
        clientLogicService.deleteClient(id);
    }

    @GET
    public ClientPageDTO getClients(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords) {
        return clientLogicService.getClients(page, maxRecords);
    }

    @GET
    @Path("{id}")
    public ClientDTO getClient(@PathParam("id") Long id) {
        return clientLogicService.getClient(id);
    }

    @PUT
    @Path("{id}")
    public void updateclient(@PathParam("id") Long id, ClientDTO client) {
        clientLogicService.updateClient(client);
    }
    
    @POST
    @Path("{idClient}/cart/{idOff}")
    public CartDTO addOfferToCart(@PathParam("idClient") Long idClient, @PathParam("idOff") Long idOffer){
        CartDTO cart = new CartDTO();
        cart.setIdClient(idClient);
        cart.setIdOffer(idOffer);
        return clientLogicService.addToCart(cart);
    }
    
    @GET
    @Path("{id}/cart")
    public OfferPageDTO getCart(@PathParam("id") Long id) {
        return clientLogicService.getCart(id);
    }
    
    @GET
    @Path("{idClient}/cart/{idOff}")
    public OfferDTO getOfferDetail(@PathParam("idCLient") Long idClient, @PathParam("idOff") Long idOffer) {
        return clientLogicService.getOfferInCart(idClient, idOffer);
    }
    
    
    @DELETE
    @Path("{id}/cart")
    public void emptyCart(@PathParam("id") Long id) {
     
        clientLogicService.emptyCart(id);
    }
    
    @DELETE
    @Path("{idClient}/cart/{idOff}")//NOMBREEEE
    public void removeOfferInCart (@PathParam("idCLient") Long idClient, @PathParam("idOff") Long idOffer) {
        CartDTO cart = new CartDTO();
        cart.setIdClient(idClient);
        cart.setIdOffer(idOffer);
        clientLogicService.deleteOfferInCart(cart);
    }
    
    
   
    
   
}
