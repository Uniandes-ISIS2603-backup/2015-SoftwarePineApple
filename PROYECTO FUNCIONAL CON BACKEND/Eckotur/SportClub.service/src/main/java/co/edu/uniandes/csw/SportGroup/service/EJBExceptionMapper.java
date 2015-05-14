package co.edu.uniandes.csw.SportGroup.service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import javax.ejb.EJBException;

@Provider
public class EJBExceptionMapper implements ExceptionMapper<EJBException> {

    public Response toResponse(EJBException exception) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(getInitCause(exception).getLocalizedMessage())
                .type(MediaType.TEXT_PLAIN)
                .build();
    }

    private Throwable getInitCause(Throwable e) {
        if (e.getCause() != null) {
            return getInitCause(e.getCause());
        } else {
            return e;
        }
    }
}
