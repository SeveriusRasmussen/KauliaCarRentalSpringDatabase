package carrental.kauliacarrentalspringdatabase.Service;

import carrental.kauliacarrentalspringdatabase.Model.Cars;
import carrental.kauliacarrentalspringdatabase.Repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KauliaService {
    @Autowired
    CarRepo carRepo;

    // Cars methods________________________
    // Call fetchAll method from CarRepo


    // Call the create method from CarRepo
    public void addCar(Cars newCar) {
        carRepo.addCar(newCar);
    }

    // renters methods________________________



    // Contracts methods________________________



    // Other methods________________________
}
