package com.demo.service;

import com.demo.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Autowired
    AppRepository appRepository;

    public String servicMethod(){

        return appRepository.repoMethod();
    }
}
