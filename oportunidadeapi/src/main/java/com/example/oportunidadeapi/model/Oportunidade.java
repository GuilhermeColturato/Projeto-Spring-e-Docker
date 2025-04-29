package com.example.oportunidadeapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "oportunidades")
public class Oportunidade {

    @Id
    private String id;
    private String descricao;
    private String data;
    private String satisfacao;
}

