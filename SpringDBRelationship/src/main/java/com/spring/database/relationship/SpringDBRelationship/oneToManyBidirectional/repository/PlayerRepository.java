package com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.repository;


import com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {
}
