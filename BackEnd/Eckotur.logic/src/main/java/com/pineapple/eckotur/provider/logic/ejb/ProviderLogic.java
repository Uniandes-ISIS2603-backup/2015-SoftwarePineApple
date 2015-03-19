package com.pineapple.eckotur.provider.logic.ejb;

import com.pineapple.eckotur.message.logic.dto.MessageDTO;
import com.pineapple.eckotur.message.logic.ejb.MessageLogic;
import com.pineapple.eckotur.offer.logic.dto.OfferDTO;
import com.pineapple.eckotur.provider.logic.api.IProviderLogic;
import com.pineapple.eckotur.provider.logic.converter.ProviderConverter;
import com.pineapple.eckotur.provider.logic.dto.ProviderDTO;
import com.pineapple.eckotur.provider.logic.dto.ProviderPageDTO;
import com.pineapple.eckotur.provider.logic.dto.SaleDTO;
import com.pineapple.eckotur.provider.logic.entity.ProviderEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class ProviderLogic implements IProviderLogic {

    @PersistenceContext(unitName = "EckoturPU")
    protected EntityManager entityManager;

    public ProviderDTO createProvider(ProviderDTO provider) {
        ProviderEntity entity = ProviderConverter.persistenceDTO2Entity(provider);
        entityManager.persist(entity);
        return ProviderConverter.entity2PersistenceDTO(entity);
    }

    public List<ProviderDTO> getProviders() {
        Query q = entityManager.createQuery("select u from ProviderEntity u");
        return ProviderConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public ProviderPageDTO getProviders(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from ProviderEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from ProviderEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        ProviderPageDTO response = new ProviderPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(ProviderConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public ProviderDTO getProvider(Long id) {
        return ProviderConverter.entity2PersistenceDTO(entityManager.find(ProviderEntity.class, id));
    }

    public void deleteProvider(Long id) {
        ProviderEntity entity = entityManager.find(ProviderEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateProvider(ProviderDTO provider) {
        ProviderEntity entity = entityManager.merge(ProviderConverter.persistenceDTO2Entity(provider));
        ProviderConverter.entity2PersistenceDTO(entity);
    }

    public List<OfferDTO> getProviderOffers(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<SaleDTO> getProviderSales(Long id) {
        return new SaleLogic().getSales(id);
    }

    public List<MessageDTO> getProviderMessages(Long id) {
        return new MessageLogic().getMessagesTo(id);
    }
}
