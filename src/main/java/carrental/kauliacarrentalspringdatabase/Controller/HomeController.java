package carrental.kauliacarrentalspringdatabase.Controller;

import carrental.kauliacarrentalspringdatabase.Model.CarType;
import carrental.kauliacarrentalspringdatabase.Model.Cars;
import carrental.kauliacarrentalspringdatabase.Service.KauliaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    @Autowired
    KauliaService service;

    @Autowired


    @GetMapping("/")
    public String home() {
        return "home/home";
    }

    // Cars____________________________
    @GetMapping("/carMenu")
    public String carMenu() {
        return "carCRUD/carMenu";
    }

    @GetMapping("/carMenu/create")
    public String carMenuCreate() {
        return "carCRUD/create";
    }

    @PostMapping("/carMenu/create")
    public String carMenuCreate(@RequestParam("CarType_id") int carTypeId,
                                @RequestParam("brand") String brand,
                                @RequestParam("model") String model,
                                @RequestParam("fuelType") String fuelType,
                                @RequestParam("registrationNumber") String registrationNumber,
                                @RequestParam("registrationYear") int registrationYear,
                                @RequestParam("registrationMonth") int registrationMonth,
                                @RequestParam("odometer") int odometer) {
        // Find CarType fra Databasen
        CarType carType = carTypeRepository.findById(carTypeId)
                        .orElseThrow(() -> new IllegalArgumentException("Invalid CarType ID: " + carTypeId));

        System.out.println("CarType_id: " + newCar.getCarType());
        System.out.println("Brand: " + newCar.getBrand());
        service.addCar(newCar);
        return "redirect:/carMenu";
    }

    @GetMapping("/selectCarType")
    public String showCarTypeSelection() {
        return "carCRUD/selectCarType"; // Dette skal matche navnet på din HTML.
    }

    @PostMapping("/selectCarType")
    public String selectCarType(@RequestParam("CarType_id") int carTypeId, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("selectedCarTypeId", carTypeId);
        return "redirect:/carMenu/create"; // returner til den oprindelige side med det valgte ID
    }
    //view one GetMapping
    //Update one GetMapping og PostMapping
    //Deletion GetMapping

    // renters CRUD

    // Contracts CRUD
}
