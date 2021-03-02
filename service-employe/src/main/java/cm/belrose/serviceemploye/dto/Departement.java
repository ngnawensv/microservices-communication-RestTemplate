package cm.belrose.serviceemploye.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ngnawen
 *
 * POJO(Simple/Plain Old Java Object) c'est un simple Object java
 * ayant des propriétés, des getters et des setters ces propriétés.
 * Cette classe est une representation de l'entité Departement de service-departement
 * @Data Annotation lombok qui permet de definir les getters, les setters, equals, etc.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departement {
    private Long id;
    private String code;
    private String nom;
    private String adresse;
}
