package org.example.springdatam1.services.impl;

import org.example.springdatam1.entity.Publisher;
import org.example.springdatam1.repository.PublisherRepository;
import org.example.springdatam1.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PublisherServiceImpl implements PublisherService {


    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public Publisher save(Publisher entity) {
        return publisherRepository.save(entity);
    }

    @Override
    public Publisher findById(Long aLong) {
        return publisherRepository.findById(aLong)
                .orElseThrow(() -> new RuntimeException("Genre not found"));
    }

    @Override
    public List<Publisher> findAll() {
        return publisherRepository.findAll();
    }

    @Override
    public Publisher update(Long aLong, Publisher entity) {
        Publisher genreDb = publisherRepository.findById(aLong).get();

        if (Objects.nonNull(entity.getName()) && !"".equalsIgnoreCase(entity.getName())) {
            genreDb.setName(entity.getName());
        }

        return publisherRepository.save(genreDb);
    }

    @Override
    public void delete(Long aLong) {
        publisherRepository.deleteById(aLong);
    }
}
