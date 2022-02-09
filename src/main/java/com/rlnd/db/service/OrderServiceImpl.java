package com.rlnd.db.service;

import java.util.Arrays;

import com.rlnd.db.dao.ECAEntries;
import com.rlnd.db.model.DefaultResponse;
import com.rlnd.db.model.ErrorResponse;
import com.rlnd.db.model.SuccessResponse;
import com.rlnd.db.model.request.RequestModel;
import com.rlnd.db.repository.ECARepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    ECARepository repository;

    @Override
    public DefaultResponse save(RequestModel requestModel) {
        try {
            ECAEntries entry = new ECAEntries(requestModel);
            entry = repository.save(entry);
            return new SuccessResponse(Arrays.asList(entry));
        } catch (Exception e) {
            return new ErrorResponse(e.getLocalizedMessage());
        }
    }

    @Override
    public DefaultResponse get() {
        return new SuccessResponse(repository.findAll());
    }
    
}
