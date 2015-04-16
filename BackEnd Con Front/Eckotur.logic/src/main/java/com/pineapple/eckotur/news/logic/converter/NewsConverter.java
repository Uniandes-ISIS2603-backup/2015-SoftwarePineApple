package com.pineapple.eckotur.news.logic.converter;

import com.pineapple.eckotur.news.logic.dto.NewsDTO;
import com.pineapple.eckotur.news.logic.entity.NewsEntity;
import java.util.ArrayList;
import java.util.List;

public class NewsConverter {

    public static NewsDTO entity2PersistenceDTO(NewsEntity entity) {
        if (entity != null) {
            NewsDTO dto = new NewsDTO();
            dto.setId(entity.getId());
            dto.setAuthorId(entity.getAuthorId());
            dto.setTitle(entity.getTitle());
            dto.setMessage(entity.getMessage());
            return dto;
        } else {
            return null;
        }
    }

    public static NewsEntity persistenceDTO2Entity(NewsDTO dto) {
        if (dto != null) {
            NewsEntity entity = new NewsEntity();
            entity.setId(dto.getId());
            entity.setAuthorId(dto.getAuthorId());
            entity.setTitle(dto.getTitle());
            entity.setMessage(dto.getMessage());
            return entity;
        } else {
            return null;
        }
    }

    public static List<NewsDTO> entity2PersistenceDTOList(List<NewsEntity> entities) {
        List<NewsDTO> dtos = new ArrayList<NewsDTO>();
        for (NewsEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<NewsEntity> persistenceDTO2EntityList(List<NewsDTO> dtos) {
        List<NewsEntity> entities = new ArrayList<NewsEntity>();
        for (NewsDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}

