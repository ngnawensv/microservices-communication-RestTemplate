package cm.belrose.serviceemploye.dto;

import cm.belrose.serviceemploye.model.Employe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ngnawen
 *
 * classe emcapsulant employe et Departement
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {
    private Employe employe;
    private Departement departement;
}
