package com.allstate.premierclaimsserver.control;

import com.allstate.premierclaimsserver.domain.Claim;
import com.allstate.premierclaimsserver.exceptions.ClaimNotFoundException;
import com.allstate.premierclaimsserver.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.*;

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
        }else if(status.equals("Open")){
            List<Claim> AllOpenClaims = new ArrayList<>();
            List<Claim> openClaims =claimService.getByStatus("Open");
            List<Claim> pendingClaims = claimService.getByStatus("Pending");
            AllOpenClaims.addAll(openClaims);
            AllOpenClaims.addAll(pendingClaims);
            return AllOpenClaims;
        }else if(status.equals("Closed")){
            List<Claim> AllClosedClaims = new ArrayList<>();
            List<Claim> closedClaims =claimService.getByStatus("Closed");
            List<Claim> rejectedClaims = claimService.getByStatus("Rejected");
            AllClosedClaims.addAll(closedClaims);
            AllClosedClaims.addAll(rejectedClaims);
            return AllClosedClaims;
        }else{
                return claimService.getByStatus(status);
            }
    }

    @GetMapping("/{claimId}")
    public Claim findById(@PathVariable("claimId") Integer id) throws ClaimNotFoundException {
        return claimService.getById(id);
    }
    @PostMapping
    public Claim saveNewClaim(@RequestBody Claim claim){return claimService.saveClaim(claim);

    }
    @PutMapping("/{id}")
    public Claim updateClaim(@PathVariable Integer id, @RequestBody HashMap<String, Object> fields) {
        return claimService.updateClaim(id, fields);
    }
}
