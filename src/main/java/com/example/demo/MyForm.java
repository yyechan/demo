package com.example.demo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MyForm {
    String cmpCd;
    String useYn;
}
