package co.edu.uniandes.csw.SportGroup.country.logic.ejb;

import co.edu.uniandes.csw.SportGroup.country.logic.api.ICountryLogic;
import co.edu.uniandes.csw.SportGroup.country.logic.converter.CountryConverter;
import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryDTO;
import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryPageDTO;
import co.edu.uniandes.csw.SportGroup.country.logic.entity.CountryEntity;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless 
@LocalBean
public class CountryLogic implements ICountryLogic{

    @PersistenceContext(unitName = "SportClassPU")
    protected EntityManager entityManager;

    public CountryDTO createCountry(CountryDTO country) {
        CountryEntity entity = CountryConverter.persistenceDTO2Entity(country);
        entityManager.persist(entity);
        return CountryConverter.entity2PersistenceDTO(entity);
    }

    public List<CountryDTO> getCountries() {
        Query q = entityManager.createQuery("select u from CountryEntity u");
        return CountryConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public CountryPageDTO getCountries(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from CountryEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from CountryEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        CountryPageDTO response = new CountryPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(CountryConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public CountryDTO getCountry(Long id) {
        return CountryConverter.entity2PersistenceDTO(entityManager.find(CountryEntity.class, id));
    }

    public void deleteCountry(Long id) {
        CountryEntity entity = entityManager.find(CountryEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateCountry(CountryDTO country) {
        CountryEntity entity = entityManager.merge(CountryConverter.persistenceDTO2Entity(country));
        CountryConverter.entity2PersistenceDTO(entity);
    }

    public CountryDTO getMostPopulated() {
        Query query = entityManager.createQuery("select u from CountryEntity u WHERE u.population = (SELECT MAX(v.population) from CountryEntity v)");
        return CountryConverter.entity2PersistenceDTO((CountryEntity)query.getSingleResult());
    }

    public CountryDTO getLeastPopulated() {
        Query query = entityManager.createQuery("select u from CountryEntity u WHERE u.population = (SELECT MIN(v.population) from CountryEntity v)");
        return CountryConverter.entity2PersistenceDTO((CountryEntity)query.getSingleResult());
    }
}
