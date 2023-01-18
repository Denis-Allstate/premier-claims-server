package com.allstate.premierclaimsserver.control;

import com.allstate.premierclaimsserver.domain.Claim;
import com.allstate.premierclaimsserver.exceptions.ClaimNotFoundException;
import com.allstate.premierclaimsserver.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimController {
    @Autowired
    private ClaimService claimService;

    @GetMapping
    public List<Claim> getAllClaims(@RequestParam(value="status", required = false) String status){
        if(status == null) {
            return claimService.getAllClaims();
        }else{
                return claimService.getByStatus(status);
            }
    }

    @GetMapping("/{claimId}")
    public Claim findById(@PathVariable("claimId") Integer id) throws ClaimNotFoundException {
        return claimService.getById(id);
    }
}
