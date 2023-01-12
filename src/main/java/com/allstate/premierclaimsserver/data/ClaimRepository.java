package com.allstate.premierclaimsserver.data;

import com.allstate.premierclaimsserver.domain.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer> {

    public List<Claim> findAllByClaimId(String  claimId);

}
