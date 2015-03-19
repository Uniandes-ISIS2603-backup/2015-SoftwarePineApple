package com.pineapple.eckotur.client.logic.converter;

import com.pineapple.eckotur.client.logic.dto.ClientDTO;
import com.pineapple.eckotur.client.logic.entity.ClientEntity;
import java.util.ArrayList;
import java.util.List;

public class ClientConverter {

    public static ClientDTO entity2PersistenceDTO(ClientEntity entity) {
        if (entity != null) {
        	ClientDTO dto = new ClientDTO();	
        	dto.setUserId(entity.getUserId());
        	dto.setUserType(entity.getUserType());
        	dto.setName(entity.getName());
        	dto.setEmail(entity.getEmail());
        	dto.setLastName(entity.getLastName());
        	dto.setBirthday(entity.getBirthday());
        	dto.setCreditCard(entity.getCreditCard());
            return dto;
        } else {
            return null;
        }
    }

    public static ClientEntity persistenceDTO2Entity(ClientDTO dto) {
        if (dto != null) {
        	ClientEntity entity = new ClientEntity();
        	entity.setUserId(dto.getUserId());
        	entity.setUserType(dto.getUserType());
        	entity.setName(dto.getName());
        	entity.setEmail(dto.getEmail());
        	entity.setLastName(dto.getLastName());
        	entity.setBirthday(dto.getBirthday());
        	entity.setCreditCard(dto.getCreditCard());
            return entity;
        } else {
            return null;
        }
    }

    public static List<ClientDTO> entity2PersistenceDTOList(List<ClientEntity> entities) {
        List<ClientDTO> dtos = new ArrayList<ClientDTO>();
        for (ClientEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<ClientEntity> persistenceDTO2EntityList(List<ClientDTO> dtos) {
        List<ClientEntity> entities = new ArrayList<ClientEntity>();
        for (ClientDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}