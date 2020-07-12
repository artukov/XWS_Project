package xws.microservis.advertservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xws.microservis.advertservice.dto.CarDTO;
import xws.microservis.advertservice.model.*;
import xws.microservis.advertservice.service.CarService;

import java.util.ArrayList;

@RestController
@RequestMapping(value= "/car")
public class CarController {


    @Autowired
    private CarService carService;

    @GetMapping(value = "/all")
    public ResponseEntity<?> getAllCars(){
        ArrayList<Car> carArrayList = carService.getAllCars();
        return new ResponseEntity<>(carArrayList,HttpStatus.OK);
    }


    @PostMapping(value = "/new" , consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> addNewCar(@RequestBody CarDTO carDTO){
        if(carDTO == null){
            return new ResponseEntity<>("Greska pri kreiranju auta", HttpStatus.BAD_REQUEST);
        }
        try{
            carService.saveNewCar(carDTO);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>("Greska pri upisu auta", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return  new ResponseEntity<>(HttpStatus.OK);

    }

    @PutMapping(value = "/modify/{carId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> modifyCar(@RequestBody Car car){

        return new ResponseEntity<>(HttpStatus.OK);


    }
    /**
     * TODO : ispis sifrarnika
     * */
    @GetMapping(value = "marke")
    public ResponseEntity<?> findAllCarMarks(){
        ArrayList<CarMark> listMark = carService.findAllCarMarks();
        if(listMark == null) {
            return new ResponseEntity<>("Lista marki automobila prazna", HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(listMark,HttpStatus.OK);


    }

    @GetMapping(value = "klase")
    public ResponseEntity<?> findAllCarClasses(){
        ArrayList<CarClass> listClass = carService.findAllCarClasses();
        if(listClass == null) {
            return new ResponseEntity<>("Lista klasi automobila prazna", HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(listClass,HttpStatus.OK);


    }



    @GetMapping(value = "modeli")
    public ResponseEntity<?> findAllCarModels(){
        ArrayList<CarModel> listModel = carService.findAllCarModels();
        if(listModel == null) {
            return new ResponseEntity<>("Lista modeli automobila prazna", HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(listModel,HttpStatus.OK);


    }


    @GetMapping(value = "/prenosi")
    public ResponseEntity<?> getAllCarTransmission(){
        ArrayList<Transmission> transmissionArrayList = carService.getAllTransmission();

        return new ResponseEntity<>(transmissionArrayList,HttpStatus.OK);

    }

    @GetMapping(value = "/goriva")
    public ResponseEntity<?> getAllCarFuel(){

        ArrayList<CarFuel> carFuelSet = carService.getAllCarFuel();

        return new ResponseEntity<>(carFuelSet,HttpStatus.OK);

    }




}
