package com.allstate.premierclaimsserver.service;

import com.allstate.premierclaimsserver.domain.Claim;
import com.allstate.premierclaimsserver.exceptions.ClaimNotFoundException;

import java.util.List;
import java.util.Map;

public interface ClaimService {

    public Claim saveClaim(Claim claim);

    public List<Claim> getAllClaims();
    public Claim getById(Integer id) throws ClaimNotFoundException;
    public List<Claim> getByStatus(String status);
    public Claim updateClaim(Integer id, Map<String, Object> fields);

}
