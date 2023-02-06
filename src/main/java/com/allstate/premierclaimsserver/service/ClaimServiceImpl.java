package com.allstate.premierclaimsserver.service;

import com.allstate.premierclaimsserver.data.ClaimRepository;
import com.allstate.premierclaimsserver.domain.Claim;
import com.allstate.premierclaimsserver.exceptions.ClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ClaimServiceImpl implements ClaimService{

    @Autowired
    private ClaimRepository claimRepository;
    @Override
    public Claim saveClaim(Claim claim) {
        return claimRepository.save(claim);
    }
    @Override
    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

    @Override
    public List<Claim> getByStatus(String status) {


        return claimRepository.findAllByStatus(status);
    }

    @Override
    public List<Claim> getByLastName(String lastName) {
        return claimRepository.findAllByLastName(lastName);
    }

    @Override
    public Claim updateClaim(Integer id, Map<String, Object> fields) {
        //load existing payment
        Claim claim = claimRepository.findById(id).get();//should check and throw exception
        //update fields that changed
        if(fields.containsKey("status")){
            claim.setStatus(fields.get("status").toString());
        }
        if (fields.containsKey("amount")){
            //any logic here eg. amount >0
            claim.setClaimAmount(Double.parseDouble(fields.get("amount").toString()));
        }

        return claimRepository.save(claim);
    }

    @Override
    public Claim getById(Integer id) throws ClaimNotFoundException {
        Optional<Claim> optionalClaim = claimRepository.findById(id);
        if (optionalClaim.isPresent()) {
            return optionalClaim.get();
        } else {
            throw new ClaimNotFoundException("There is no claim with id " + id);
        }
    }
}
