package pl.coderslab.charity.donation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.donation.entity.Donation;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {

    @Query("select SUM(quantity) from Donation")
    Optional<Long> countTotalBagsNumber();

}
