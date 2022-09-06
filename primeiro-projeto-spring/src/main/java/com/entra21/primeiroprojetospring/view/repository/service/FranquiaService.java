package com.entra21.primeiroprojetospring.view.repository.service;

import com.entra21.primeiroprojetospring.view.repository.FranquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FranquiaService {

    @Autowired
    private FranquiaRepository franquiaRepository;
}
