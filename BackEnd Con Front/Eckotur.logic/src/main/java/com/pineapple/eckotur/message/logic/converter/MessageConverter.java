package com.pineapple.eckotur.message.logic.converter;

import com.pineapple.eckotur.message.logic.dto.MessageDTO;
import com.pineapple.eckotur.message.logic.entity.MessageEntity;
import java.util.ArrayList;
import java.util.List;

public class MessageConverter {

    public static MessageDTO entity2PersistenceDTO(MessageEntity entity) {
        if (entity != null) {
        	MessageDTO dto = new MessageDTO();	
        	dto.setId(entity.getId());
        	dto.setIdUserFrom(entity.getIdUserFrom());
        	dto.setIdUserTo(entity.getIdUserTo());
        	dto.setSubject(entity.getSubject());
        	dto.setMessage(entity.getMessage());
        	dto.setDate(entity.getDate());
            return dto;
        } else {
            return null;
        }
    }

    public static MessageEntity persistenceDTO2Entity(MessageDTO dto) {
        if (dto != null) {
        	MessageEntity entity = new MessageEntity();
        	entity.setId(dto.getId());
        	entity.setIdUserFrom(dto.getIdUserFrom());
        	entity.setIdUserTo(dto.getIdUserTo());
        	entity.setSubject(dto.getSubject());
        	entity.setMessage(dto.getMessage());
        	entity.setDate(dto.getDate());
            return entity;
        } else {
            return null;
        }
    }

    public static List<MessageDTO> entity2PersistenceDTOList(List<MessageEntity> entities) {
        List<MessageDTO> dtos = new ArrayList<MessageDTO>();
        for (MessageEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<MessageEntity> persistenceDTO2EntityList(List<MessageDTO> dtos) {
        List<MessageEntity> entities = new ArrayList<MessageEntity>();
        for (MessageDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
