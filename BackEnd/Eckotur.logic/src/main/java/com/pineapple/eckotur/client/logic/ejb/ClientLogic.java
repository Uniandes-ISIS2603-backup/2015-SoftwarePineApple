package com.pineapple.eckotur.client.logic.ejb;

import com.pineapple.eckotur.client.logic.api.IClientLogic;
import com.pineapple.eckotur.client.logic.dto.ClientDTO;
import com.pineapple.eckotur.client.logic.dto.ClientPageDTO;
import com.pineapple.eckotur.client.logic.converter.ClientConverter;
import com.pineapple.eckotur.client.logic.entity.ClientEntity;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless 
@LocalBean
public class ClientLogic implements IClientLogic {

    @PersistenceContext(unitName = "EckoturPU")
    protected EntityManager entityManager;

    public ClientDTO createClient(ClientDTO client) {
        ClientEntity entity = ClientConverter.persistenceDTO2Entity(client);
        entityManager.persist(entity);
        return ClientConverter.entity2PersistenceDTO(entity);
    }

    public ClientPageDTO getClients(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from ClientEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from ClientEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        ClientPageDTO response = new ClientPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(ClientConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }
    public List<ClientDTO> getClients(){
        Query q = entityManager.createQuery("select u from ClientEntity u");
        return ClientConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public ClientDTO getClient(Long id) {
        return ClientConverter.entity2PersistenceDTO(entityManager.find(ClientEntity.class, id));
    }
   
    
   
    public void deleteClient(Long id) {
        ClientEntity entity = entityManager.find(ClientEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateClient(ClientDTO client) {
        ClientEntity entity = entityManager.merge(ClientConverter.persistenceDTO2Entity(client));
        ClientConverter.entity2PersistenceDTO(entity);
    }

    public void getCart(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
