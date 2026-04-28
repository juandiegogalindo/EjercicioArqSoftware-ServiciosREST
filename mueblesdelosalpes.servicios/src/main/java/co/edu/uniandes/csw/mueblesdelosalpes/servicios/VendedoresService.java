/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.servicios;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Vendedor;
import co.edu.uniandes.csw.mueblesdelosalpes.excepciones.OperacionInvalidaException;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioVendedoresMockLocal;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jdgal
 */

@Path("vendedores")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class VendedoresService {

     @EJB
    private IServicioVendedoresMockLocal vendedorEjb;

    // 🔽 AQUÍ VAN LOS ENDPOINTS 🔽

    @GET
    public List<Vendedor> getVendedores() {
        return vendedorEjb.getVendedores();
    }

    @POST
    public void agregarVendedor(Vendedor vendedor) throws OperacionInvalidaException {
        vendedorEjb.agregarVendedor(vendedor);
    }

    @DELETE
    @Path("{id}")
    public void eliminarVendedor(@PathParam("id") long id) throws OperacionInvalidaException {
        vendedorEjb.eliminarVendedor(id);
    }
}