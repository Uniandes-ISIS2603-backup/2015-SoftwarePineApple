/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.SportGroup.country.logic.converter;

import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryDTO;
import co.edu.uniandes.csw.SportGroup.country.logic.entity.CountryEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public class CountryConverter {
    public static CountryDTO entity2PersistenceDTO(CountryEntity entity) {
        if (entity != null) {
            CountryDTO dto = new CountryDTO();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setPopulation(entity.getPopulation());
            return dto;
        } else {
            return null;
        }
    }

    public static CountryEntity persistenceDTO2Entity(CountryDTO dto) {
        if (dto != null) {
            CountryEntity entity = new CountryEntity();
            entity.setId(dto.getId());

            entity.setName(dto.getName());

            entity.setPopulation(dto.getPopulation());

            return entity;
        } else {
            return null;
        }
    }

    public static List<CountryDTO> entity2PersistenceDTOList(List<CountryEntity> entities) {
        List<CountryDTO> dtos = new ArrayList<CountryDTO>();
        for (CountryEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<CountryEntity> persistenceDTO2EntityList(List<CountryDTO> dtos) {
        List<CountryEntity> entities = new ArrayList<CountryEntity>();
        for (CountryDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
