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
        if(claimRepository.count() == 0) {
            Claim newClaim = new Claim(1,500.00, "Denis", "Friel", "DenisTest@test.com", "0774545856", "Open", Date.valueOf("2023-12-01"), "1001", "Motor","", "Hitting a parked car", "", "2023", "Ford", "F150", "","");
            Claim newClaim1 = new Claim(2,500.00, "Denis", "Friel", "DenisTest@test.com", "0774545856", "Pending", Date.valueOf("2023-12-01"), "1001", "Motor", "", "Hitting a parked car", "", "2023", "Ford", "F150", "","");

            Claim savedClaim = claimRepository.save(newClaim);
            savedClaim = claimRepository.save(newClaim1);
            //System.out.println("Claim saved with id" + savedClaim.getId());
        }
    }
}
