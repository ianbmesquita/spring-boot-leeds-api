package com.redhat.leeds.application.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.redhat.leeds.api.dto.LeedDTO;
import com.redhat.leeds.application.mapper.LeedMapper;
import com.redhat.leeds.application.model.Leed;
import com.redhat.leeds.infrastructure.dataprovider.repository.LeedsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeedsService {
    @Autowired
    private LeedMapper mapper;

    @Autowired
    private KafkaProducerService kafkaService;

    @Autowired
    private LeedsRepository repository;

    public Leed processaNovoLeed(LeedDTO leedDTO) {
        try {
            var leedSalvo = repository.save(mapper.convertDTOToEntity(leedDTO));

            kafkaService.sendMessage("leed-notification", mapper.convertEntityToJsonString(leedSalvo));

            return leedSalvo;
        } catch (RuntimeException exception) {
            throw new RuntimeException("Ocorreu erro ao salvar o leed: " + exception.getMessage());
        } catch (JsonProcessingException exception) {
            throw new RuntimeException("Ocorreu erro ao converter o leed para JSON: " + exception.getMessage());
        }
    }
}
