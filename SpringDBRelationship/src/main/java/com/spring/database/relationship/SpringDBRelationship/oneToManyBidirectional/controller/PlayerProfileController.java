package com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.controller;


import com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.entity.PlayerProfile;
import com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.service.PlayerProfileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles")
public class PlayerProfileController {
    @Autowired
    PlayerProfileService playerProfileService;

    @GetMapping
    public List<PlayerProfile> getAllPlayersProfile(){
        return playerProfileService.getAllPlayersProfile();
    }

    @GetMapping("/{id}")
    public PlayerProfile getPlayerProfileByID(@PathVariable int id){
        return playerProfileService.getPlayerProfileByID(id);
    }

    @PostMapping
    public PlayerProfile addPlayerProfile(@RequestBody PlayerProfile playerProfile){
        return playerProfileService.addPlayerProfile(playerProfile);
    }

    @DeleteMapping("/{id}")
    public void deletePlayerProfile(@PathVariable int id){
        playerProfileService.deletePlayerProfile(id);
    }
}
