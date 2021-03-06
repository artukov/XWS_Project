package xws.microservis.advertservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xws.microservis.advertservice.dto.BundleDTO;
import xws.microservis.advertservice.dto.RentRequestDTO;
import xws.microservis.advertservice.model.RentRequest;
import xws.microservis.advertservice.model.RentRequestBundle;
import xws.microservis.advertservice.model.User;
import xws.microservis.advertservice.service.RentRequestService;
import xws.microservis.advertservice.service.UserService;

import javax.websocket.server.PathParam;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/request")
@CrossOrigin(origins= "*")
public class RequestController {

    @Autowired
    private RentRequestService requestService;

    @Autowired
    private UserService userService;


    @GetMapping(value = "/all/{userId}", produces = "application/json")
    public ResponseEntity<?> getUserAllRequest(@PathParam("userId") Long id){

        User user = userService.findUser(id);
        if(user == null){
            return new ResponseEntity<>("AdvertService: korisnik ne postoji", HttpStatus.BAD_REQUEST);
        }

        ArrayList<RentRequest> requestArrayList = requestService.findUserAll(id);

        return new ResponseEntity<>(requestArrayList,HttpStatus.OK);

    }

    @GetMapping(value = "/all/bundle/{userId}", produces = "application/json")
    public ResponseEntity<?> getUserAllBundleRequest(@PathParam("userId") Long id){

        User user = userService.findUser(id);
        if(user == null){
            return new ResponseEntity<>("AdvertService: korisnik ne postoji", HttpStatus.BAD_REQUEST);
        }

        ArrayList<RentRequestBundle> requestArrayList = requestService.findUserAllBundle(id);

        return new ResponseEntity<>(requestArrayList,HttpStatus.OK);

    }

    @PutMapping(value = "/modify", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> modifyRentRequest(@RequestBody RentRequestDTO rentRequestDTO){

        try {
            requestService.save(rentRequestDTO);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("AdvertService: greska pri mijenjaju zahtjeva", HttpStatus.INTERNAL_SERVER_ERROR);
        }


        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/modify/bundle",consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> modifyBundleRequest(@RequestBody BundleDTO bundleDTO){

        try {
            requestService.modifyBundle(bundleDTO);
        } catch (Exception e) {
            e.printStackTrace();
            return  new ResponseEntity<>("AdvertService: greska pri mijenjanju bundle zahtjeva",HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return  new ResponseEntity<>(HttpStatus.OK);
    }

}
