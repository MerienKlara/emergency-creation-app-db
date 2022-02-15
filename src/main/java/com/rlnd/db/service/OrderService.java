package com.rlnd.db.service;

import com.rlnd.db.model.DefaultResponse;
import com.rlnd.db.model.request.RequestModel;

public interface OrderService {

    DefaultResponse save(RequestModel requestModel);
    DefaultResponse delete(String id);
    DefaultResponse get();
    
}
