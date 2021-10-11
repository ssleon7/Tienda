/*package edu.mintic.Tienda1.model.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import edu.mintic.Tienda1.model.entity.Provider;
import edu.mintic.Tienda1.model.repository.ProviderRepository;
import edu.mintic.Tienda1.util.CSVHelper;

@Service
public class CSVService {
    @Autowired
    ProviderRepository repository;

    public void save(MultipartFile file) {
        try {
            List<Provider> tutorials = CSVHelper.csvToProviders(file.getInputStream());
            repository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public ByteArrayInputStream load() {
        List<Provider> tutorials = repository.findAll();

        ByteArrayInputStream in = CSVHelper.providerToCSV(tutorials);
        return in;
    }

    public List<Provider> getAllTutorials() {
        return repository.findAll();
    }

}
*/