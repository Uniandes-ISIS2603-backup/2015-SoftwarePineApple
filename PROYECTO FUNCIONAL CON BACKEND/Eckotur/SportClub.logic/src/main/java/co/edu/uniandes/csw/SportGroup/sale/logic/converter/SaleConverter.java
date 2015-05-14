/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.SportGroup.sale.logic.converter;

import co.edu.uniandes.csw.SportGroup.sale.logic.dto.SaleDTO;
import co.edu.uniandes.csw.SportGroup.sale.logic.entity.SaleEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public class SaleConverter {
    public static SaleDTO entity2PersistenceDTO(SaleEntity entity) {
        if (entity != null) {
            SaleDTO dto = new SaleDTO();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setPopulation(entity.getPopulation());
            return dto;
        } else {
            return null;
        }
    }

    public static SaleEntity persistenceDTO2Entity(SaleDTO dto) {
        if (dto != null) {
            SaleEntity entity = new SaleEntity();
            entity.setId(dto.getId());

            entity.setName(dto.getName());

            entity.setPopulation(dto.getPopulation());

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
