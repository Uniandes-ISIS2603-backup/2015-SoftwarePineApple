package co.edu.uniandes.csw.SportGroup.sale.logic.ejb;

import co.edu.uniandes.csw.SportGroup.sale.logic.api.ISaleLogic;
import co.edu.uniandes.csw.SportGroup.sale.logic.converter.SaleConverter;
import co.edu.uniandes.csw.SportGroup.sale.logic.dto.SaleDTO;
import co.edu.uniandes.csw.SportGroup.sale.logic.dto.SalePageDTO;
import co.edu.uniandes.csw.SportGroup.sale.logic.entity.SaleEntity;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless 
@LocalBean
public class SaleLogic implements ISaleLogic{

    @PersistenceContext(unitName = "SportClassPU")
    protected EntityManager entityManager;

    public SaleDTO createSale(SaleDTO sale) {
        SaleEntity entity = SaleConverter.persistenceDTO2Entity(sale);
        entityManager.persist(entity);
        return SaleConverter.entity2PersistenceDTO(entity);
    }

    public List<SaleDTO> getSales() {
        Query q = entityManager.createQuery("select u from CountryEntity u");
        return SaleConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public SalePageDTO getSales(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from CountryEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from CountryEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        SalePageDTO response = new SalePageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(SaleConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public SaleDTO getSale(Long id) {
        return SaleConverter.entity2PersistenceDTO(entityManager.find(SaleEntity.class, id));
    }

    public void deleteSale(Long id) {
        SaleEntity entity = entityManager.find(SaleEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateSale(SaleDTO sale) {
        SaleEntity entity = entityManager.merge(SaleConverter.persistenceDTO2Entity(sale));
        SaleConverter.entity2PersistenceDTO(entity);
    }

}
