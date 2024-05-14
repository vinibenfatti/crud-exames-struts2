package org.apache.struts.edit.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exam {

    private Long cd_exame;

    private String nm_exame;

    private boolean ic_ativo;

    private String ds_detalhe_exame;

    private String ds_detalhe_exame1;
}
