package com.allstate.premierclaimsserver.service;

import com.allstate.premierclaimsserver.domain.Claim;
import com.allstate.premierclaimsserver.exceptions.ClaimNotFoundException;

import java.util.List;

public interface ClaimService {

    public void saveClaim(Claim claim);

    public List<Claim> getAllClaims();
    public Claim getById(Integer id) throws ClaimNotFoundException;
    public List<Claim> getByStatus(String status);

}
