package com.pineapple.eckotur.provider.logic.converter;

import com.pineapple.eckotur.provider.logic.dto.SaleDTO;
import com.pineapple.eckotur.provider.logic.entity.SaleEntity;
import java.util.ArrayList;
import java.util.List;

public class SaleConverter 
{
	public static SaleDTO entity2PersistenceDTO(SaleEntity entity) {
        if (entity != null) {
        	SaleDTO dto = new SaleDTO();	
        	dto.setTransactionId(entity.getTransactionId());
        	dto.setBuyerId(entity.getBuyerId());
        	dto.setSellerId(entity.getSellerId());
        	dto.setOfferId(entity.getOfferId());
        	dto.setDate(entity.getDate());
        	dto.setValue(entity.getValue());
        	dto.setQuantity(entity.getQuantity());
            return dto;
        } else {
            return null;
        }
    }

    public static SaleEntity persistenceDTO2Entity(SaleDTO dto) {
        if (dto != null) {
        	SaleEntity entity = new SaleEntity();
        	entity.setTransactionId(dto.getTransactionId());
        	entity.setBuyerId(dto.getBuyerId());
        	entity.setSellerId(dto.getSellerId());
        	entity.setOfferId(dto.getOfferId());
        	entity.setDate(dto.getDate());
        	entity.setValue(dto.getValue());
        	entity.setQuantity(dto.getQuantity());
            return entity;
        } else {
            return null;
        }
    }

    public static List<SaleDTO> entity2PersistenceDTOList(List<SaleEntity> entities) {
        List<SaleDTO> dtos = new ArrayList<SaleDTO>();
        for (SaleEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<SaleEntity> persistenceDTO2EntityList(List<SaleDTO> dtos) {
        List<SaleEntity> entities = new ArrayList<SaleEntity>();
        for (SaleDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
