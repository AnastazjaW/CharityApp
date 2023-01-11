package pl.coderslab.charity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.category.entity.Category;
import pl.coderslab.charity.category.service.CategoryService;
import pl.coderslab.charity.donation.entity.Donation;
import pl.coderslab.charity.donation.service.DonationService;
import pl.coderslab.charity.institution.entity.Institution;
import pl.coderslab.charity.institution.service.InstitutionService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DonationController {

    private final CategoryService categoryService;
    private final InstitutionService institutionService;
    private final DonationService donationService;

    @ModelAttribute("categories")
    public List<Category> categories() {
        return categoryService.findAll();
    }

    @ModelAttribute("institutions")
    public List<Institution> institutions() {
        return institutionService.findFourInstitutions();
    }

    @GetMapping("/donation")
    public String donationAction(Model model) {
        model.addAttribute("donation", new Donation());
        return "form";
    }

    @PostMapping("/donation")
    public String saveDonation(@ModelAttribute("donation") Donation donation) {
        donationService.save(donation);
        return "form-confirmation";
    }



}
