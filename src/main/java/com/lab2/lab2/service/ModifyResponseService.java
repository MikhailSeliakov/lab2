package com.lab2.lab2.service;

import com.lab2.lab2.model.Response;
import org.springframework.stereotype.Service;

@Service
public interface ModifyResponseService {

    Response modify(Response response);

}
