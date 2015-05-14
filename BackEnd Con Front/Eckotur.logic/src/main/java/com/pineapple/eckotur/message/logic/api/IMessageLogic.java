package com.pineapple.eckotur.message.logic.api;

import com.pineapple.eckotur.message.logic.dto.MessageDTO;
import com.pineapple.eckotur.message.logic.dto.MessagePageDTO;

import java.util.List;

public interface IMessageLogic {
    public MessageDTO createMessage(MessageDTO detail);
	
    public List<MessageDTO> getMessagesFrom(Long userId) ;
    
    public List<MessageDTO> getMessagesTo(Long userId);
    
    public MessagePageDTO getMessages(Integer page, Integer maxRecords);
    
    public void deleteMessage(Long id);
    
    public MessageDTO getMessage(Long id);
}
