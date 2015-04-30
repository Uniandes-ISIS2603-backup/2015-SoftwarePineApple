package com.pineapple.eckotur.service;

import com.pineapple.eckotur.offer.logic.api.IOfferLogic;
import com.pineapple.eckotur.offer.logic.dto.OfferDTO;
import com.pineapple.eckotur.offer.logic.dto.OfferPageDTO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/offers")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OfferService {

    @Inject
    protected IOfferLogic catalogLogicService;

    
    @GET
    public OfferPageDTO getOffer(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords) {
        return catalogLogicService.getOffers(page, maxRecords);
    }

    @GET
    @Path("{id}")
    public OfferDTO getOffer(@PathParam("id") Long id) {
        return catalogLogicService.getOffer(id);
    }

}