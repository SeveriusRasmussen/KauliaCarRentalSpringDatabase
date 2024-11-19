package carrental.kauliacarrentalspringdatabase.Repository;

import carrental.kauliacarrentalspringdatabase.Model.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepo {
    @Autowired
    JdbcTemplate template;

    //CARS CRUD_______________________
    //C make a new car
    public void addCar(Cars newCar) {
        String sql = "INSERT INTO cars (carType_id, brand, model, fuel_type, registration_number, registration_year, registration_month, odometer) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        template.update(sql, newCar.getCarType(), newCar.getBrand(), newCar.getModel(), newCar.getFuelType(), newCar.getRegistrationNumber(), newCar.getRegistrationYear(), newCar.getRegistrationMonth(), newCar.getOdometer());
    }
}
