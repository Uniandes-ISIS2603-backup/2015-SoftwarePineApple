package com.pineapple.eckotur.offer.logic.converter;

import com.pineapple.eckotur.offer.logic.dto.OfferDTO;
import com.pineapple.eckotur.offer.logic.entity.OfferEntity;
import java.util.ArrayList;
import java.util.List;

public class CatalogConverter {

    public static OfferDTO entity2PersistenceDTO(OfferEntity entity) {
        if (entity != null) {
        	OfferDTO dto = new OfferDTO();	
        	dto.setName(entity.getName());
        	dto.setWebpage(entity.getWebpage());
        	dto.setDescription(entity.getDescription());
            return dto;
        } else {
            return null;
        }
    }

    public static OfferEntity persistenceDTO2Entity(OfferDTO dto) {
        if (dto != null) {
        	OfferEntity entity = new OfferEntity();
        	entity.setUserId(dto.getId());
        	entity.setName(dto.getName());
        	entity.setWebpage(dto.getWebpage());
        	entity.setDescription(dto.getDescription());
            return entity;
        } else {
            return null;
        }
    }

    public static List<OfferDTO> entity2PersistenceDTOList(List<OfferEntity> entities) {
        List<OfferDTO> dtos = new ArrayList<OfferDTO>();
        for (OfferEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<OfferEntity> persistenceDTO2EntityList(List<OfferDTO> dtos) {
        List<OfferEntity> entities = new ArrayList<OfferEntity>();
        for (OfferDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
