package pl.coderslab.charity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.donation.service.DonationService;
import pl.coderslab.charity.institution.entity.Institution;
import pl.coderslab.charity.institution.service.InstitutionService;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class HomeController {
    private final InstitutionService institutionService;
    private final DonationService donationService;

    @RequestMapping("/")
    public String homeAction(Model model){
        return "index";
    }

    @ModelAttribute("institutions")
    public List<Institution> institutions() {
        return institutionService.findFourInstitutions();
    }

    @ModelAttribute("totalDonationsNumber")
    public long donationsNumber() {
        return donationService.countTotalDonationsNumber();
    }

    @ModelAttribute("totalBagsNumber")
    public long bagsNumber() {
        return donationService.countTotalBagsNumber();
    }

}
