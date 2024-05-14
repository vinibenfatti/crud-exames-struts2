package org.apache.struts.edit.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String nm_login;
    String ds_senha;
    Double qt_tempo_inatividade;
}
