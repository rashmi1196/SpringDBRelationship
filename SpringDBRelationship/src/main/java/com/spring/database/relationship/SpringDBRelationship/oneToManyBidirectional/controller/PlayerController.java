package com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.controller;


import com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.entity.Player;
import com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.entity.Registration;
import com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.entity.Tournament;
import com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.service.PlayerProfileService;
import com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.service.PlayerService;

import com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.entity.PlayerProfile;
import com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @Autowired
    PlayerProfileService profileService;

    @Autowired
    RegistrationService registrationService;

    @GetMapping
    public List<Player> getAllPlayers(){
              return playerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public Player getPlayerByID(@PathVariable int id){
        return playerService.getPlayerByID(id);
    }

    @PostMapping
    public Player addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable int id){
        playerService.deletePlayer(id);
    }

    //one-to-one relationship
    @PutMapping("/{id}/profiles/{profile_id}")
    public Player assignDetails (@PathVariable int id, @PathVariable int profile_id){
        PlayerProfile playerProfile = profileService.getPlayerProfileByID(profile_id);
        System.out.println(playerProfile);
        return playerService.assignProfile(id,playerProfile);
    }

    @PutMapping("/{id}/registrations/{registration_id}")
    public Player addRegistration(@PathVariable int id, @PathVariable int registration_id){
        Registration registration= registrationService.getRegistrationByID(registration_id);
        System.out.println(registration);
        return playerService.assignRegistration(id,registration);
    }

    @PutMapping("/{id}/removeRegistrations/{registration_id}")
    public Player removeRegistration(@PathVariable int id, @PathVariable int registration_id){
        Registration registration= registrationService.getRegistrationByID(registration_id);
        System.out.println(registration);
        return playerService.removeRegistrations(id,registration);
    }
}
