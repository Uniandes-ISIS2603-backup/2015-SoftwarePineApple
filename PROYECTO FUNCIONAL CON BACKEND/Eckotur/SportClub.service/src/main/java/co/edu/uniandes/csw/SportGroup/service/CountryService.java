package co.edu.uniandes.csw.SportGroup.service;

import co.edu.uniandes.csw.SportGroup.country.logic.api.ICountryLogic;
import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryDTO;
import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryPageDTO;

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

@Path("/countries")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CountryService {

    @Inject
    protected ICountryLogic countryLogic;

    @POST
    public CountryDTO createCountry(CountryDTO sport) {
        return countryLogic.createCountry(sport);
    }

    @DELETE
    @Path("{id}")
    public void deleteCountry(@PathParam("id") Long id) {
        countryLogic.deleteCountry(id);
    }

    @GET
    public CountryPageDTO getCountries(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords) {
        return countryLogic.getCountries(page, maxRecords);
    }

    @GET
    @Path("{id}")
    public CountryDTO getCountry(@PathParam("id") Long id) {
        return countryLogic.getCountry(id);
    }

    @PUT
    @Path("{id}")
    public void updateCountry(@PathParam("id") Long id, CountryDTO sport) {
        countryLogic.updateCountry(sport);
    }

    @GET
    @Path("mostPopulated")
    public CountryDTO getMostPopulated() {
        return countryLogic.getMostPopulated();
    }

    @GET
    @Path("leastPopulated")
    public CountryDTO getLeastPopulated() {
        return countryLogic.getLeastPopulated();
    }
}
