package co.edu.uniandes.csw.SportGroup.service;

import co.edu.uniandes.csw.SportGroup.sale.logic.api.ISaleLogic;
import co.edu.uniandes.csw.SportGroup.sale.logic.dto.SaleDTO;
import co.edu.uniandes.csw.SportGroup.sale.logic.dto.SalePageDTO;

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

@Path("/sales")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SaleService {

    @Inject
    protected ISaleLogic saleLogic;

    @POST
    public SaleDTO createSale(SaleDTO sale) {
        return saleLogic.createSale(sale);
    }

    @DELETE
    @Path("{id}")
    public void deleteSale(@PathParam("id") Long id) {
        saleLogic.deleteSale(id);
    }

    @GET
    public SalePageDTO getSales(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords) {
        return saleLogic.getSales(page, maxRecords);
    }

    @GET
    @Path("{id}")
    public SaleDTO getSale(@PathParam("id") Long id) {
        return saleLogic.getSale(id);
    }

    @PUT
    @Path("{id}")
    public void updateSale(@PathParam("id") Long id, SaleDTO sale) {
        saleLogic.updateSale(sale);
    }

   
}
