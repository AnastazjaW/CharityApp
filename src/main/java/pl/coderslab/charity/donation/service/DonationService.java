package pl.coderslab.charity.donation.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.donation.entity.Donation;
import pl.coderslab.charity.donation.repository.DonationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonationService {
    private final DonationRepository donationRepository;

    public List<Donation> findAll() {
        return donationRepository.findAll();
    }

    public long countTotalBagsNumber() {
        return donationRepository.countTotalBagsNumber().orElse(0L);
    }
    public long countTotalDonationsNumber() {
        return donationRepository.count();
    }

    public void save(Donation donation) {
        donationRepository.save(donation);
    }
}
