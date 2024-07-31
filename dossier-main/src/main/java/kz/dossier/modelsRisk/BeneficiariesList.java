package kz.dossier.modelsRisk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "beneficiaries_list", schema = "imp_risk")
public class BeneficiariesList {
    @Id
    private Integer id;
    private String iin;
    private String status;
}
