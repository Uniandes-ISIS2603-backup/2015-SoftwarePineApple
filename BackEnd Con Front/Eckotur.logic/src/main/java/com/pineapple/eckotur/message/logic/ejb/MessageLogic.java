package com.pineapple.eckotur.message.logic.ejb;

import com.pineapple.eckotur.message.logic.api.IMessageLogic;
import com.pineapple.eckotur.message.logic.converter.MessageConverter;
import com.pineapple.eckotur.message.logic.dto.MessageDTO;
import com.pineapple.eckotur.message.logic.dto.MessagePageDTO;
import com.pineapple.eckotur.message.logic.entity.MessageEntity;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless 
@LocalBean
public class MessageLogic implements IMessageLogic {

    @PersistenceContext(unitName = "EckoturPU")
    protected EntityManager entityManager;

    public MessageDTO createMessage(MessageDTO detail) {
        MessageEntity entity = MessageConverter.persistenceDTO2Entity(detail);
        entityManager.persist(entity);
        return MessageConverter.entity2PersistenceDTO(entity);
    }

    public List<MessageDTO> getMessagesFrom(Long userId) {
        Query q = entityManager.createQuery("select u from MessageEntity u where u.userIdFrom="+userId);
        return MessageConverter.entity2PersistenceDTOList(q.getResultList());
    }
    
    public List<MessageDTO> getMessagesTo(Long userId) {
        Query q = entityManager.createQuery("select u from MessageEntity u where u.userIdTo="+userId);
        return MessageConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public MessagePageDTO getMessages(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from MessageEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from MessageEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        MessagePageDTO response = new MessagePageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(MessageConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public void deleteMessage(Long id) {
        MessageEntity entity = entityManager.find(MessageEntity.class, id);
        entityManager.remove(entity);
    }
    
    public MessageDTO getMessage(Long id) {
        return MessageConverter.entity2PersistenceDTO(entityManager.find(MessageEntity.class, id));
    }
}