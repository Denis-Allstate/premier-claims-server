package com.allstate.premierclaimsserver.service;

import com.allstate.premierclaimsserver.data.ClaimRepository;
import com.allstate.premierclaimsserver.domain.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;
@Service
public class BootstrapService {
    @Autowired
    private ClaimRepository claimRepository;

    @PostConstruct
    public void setUpInitialData(){
        int numberOfClaims = claimRepository.findAll().size();
        if(numberOfClaims == 0) {
            Claim newClaim = new Claim(7000.00, "Denis", "Friel", "DenisTest@test.com", "0774545856", "Open", Date.valueOf("2023-12-01"), "1001", "Auto","Hitting a parked car");
            Claim savedClaim = claimRepository.save(newClaim);
            System.out.println("Claim saved with id" + savedClaim.getId());
        }
    }
}
