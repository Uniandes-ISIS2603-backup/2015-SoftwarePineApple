package com.pineapple.eckotur.news.logic.api;

import com.pineapple.eckotur.news.logic.dto.NewsDTO;
import com.pineapple.eckotur.news.logic.dto.NewsPageDTO;
import java.util.List;

public interface INewsLogic {
    public NewsDTO createNews(NewsDTO detail);

    public List<NewsDTO> getNews();

    public NewsPageDTO getNews(Integer page, Integer maxRecords);

    public NewsDTO getNews(Long id);
    
    public List<NewsDTO> getNewsByAuthor(Long authorId);
    
    public void deleteNews(Long id);
}
