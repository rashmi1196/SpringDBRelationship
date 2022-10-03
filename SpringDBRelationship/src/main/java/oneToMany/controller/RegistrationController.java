package oneToMany.controller;


import oneToMany.entity.Registration;
import oneToMany.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;


    @GetMapping
    public List<Registration> findAllRegistration(){
        return registrationService.findAllRegistration();
    }

    @GetMapping("/{id}")
    public Registration getRegistrationByID(@PathVariable int id){
        return registrationService.getRegistrationByID(id);
    }

    @PostMapping
    public Registration addRegistration(@RequestBody Registration registration){
        return registrationService.addRegistration(registration);
    }

    @DeleteMapping("/{id}")
    public void deleteRegistration(@PathVariable int id){
        registrationService.deleteRegistration(id);
    }




}
