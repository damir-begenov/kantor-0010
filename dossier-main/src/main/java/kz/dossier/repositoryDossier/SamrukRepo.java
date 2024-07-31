package kz.dossier.repositoryDossier;

import kz.dossier.modelsDossier.Samruk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SamrukRepo extends JpaRepository<Samruk, Long> {
    @Query(value = "select * from imp_kfm_db.samruk_kazyna where supplier = ?1", nativeQuery = true)
    List<Samruk> getBySupplier(String bin);
    @Query(value = "select * from imp_kfm_db.samruk_kazyna where customer = ?1", nativeQuery = true)
    List<Samruk> getByCustomer(String bin);

    @Query(value = "select * from imp_kfm_db.samruk_kazyna where extract(year from contract_date) = ?2 and supplier = ?1", nativeQuery = true)
    List<Samruk> getBySupplierAndYear(String bin, Integer year);

    @Query(value = "select * from imp_kfm_db.samruk_kazyna where extract(year from contract_date) = ?2 and customer = ?1", nativeQuery = true)
    List<Samruk> getByCustomerAndYear(String bin, Integer year);

    @Query(value = "select * from imp_kfm_db.samruk_kazyna where contract_date is NULL  and supplier = ?1", nativeQuery = true)
    List<Samruk> getBySupplierAndNullYear(String bin);

    @Query(value = "select * from imp_kfm_db.samruk_kazyna where contract_date is NULL  and customer = ?1", nativeQuery = true)
    List<Samruk> getByCustomerAndNullYear(String bin);

}
