package com.pineapple.eckotur.offer.logic.converter;

import com.pineapple.eckotur.provider.logic.dto.ProviderDTO;
import com.pineapple.eckotur.provider.logic.entity.ProviderEntity;
import java.util.ArrayList;
import java.util.List;

public class CatalogConverter {

    public static ProviderDTO entity2PersistenceDTO(ProviderEntity entity) {
        if (entity != null) {
        	ProviderDTO dto = new ProviderDTO();	
        	dto.setUserId(entity.getUserId());
        	dto.setUserType(entity.getUserType());
        	dto.setName(entity.getName());
        	dto.setEmail(entity.getEmail());
        	dto.setWebpage(entity.getWebpage());
        	dto.setDescription(entity.getDescription());
        	dto.setBankAccount(entity.getBankAccount());
            return dto;
        } else {
            return null;
        }
    }

    public static ProviderEntity persistenceDTO2Entity(ProviderDTO dto) {
        if (dto != null) {
        	ProviderEntity entity = new ProviderEntity();
        	entity.setUserId(dto.getUserId());
        	entity.setUserType(dto.getUserType());
        	entity.setName(dto.getName());
        	entity.setEmail(dto.getEmail());
        	entity.setWebpage(dto.getWebpage());
        	entity.setDescription(dto.getDescription());
        	entity.setBankAccount(dto.getBankAccount());
            return entity;
        } else {
            return null;
        }
    }

    public static List<ProviderDTO> entity2PersistenceDTOList(List<ProviderEntity> entities) {
        List<ProviderDTO> dtos = new ArrayList<ProviderDTO>();
        for (ProviderEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<ProviderEntity> persistenceDTO2EntityList(List<ProviderDTO> dtos) {
        List<ProviderEntity> entities = new ArrayList<ProviderEntity>();
        for (ProviderDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
