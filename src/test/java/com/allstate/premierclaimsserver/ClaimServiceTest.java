package com.allstate.premierclaimsserver;
import com.allstate.premierclaimsserver.control.ClaimController;
import com.allstate.premierclaimsserver.data.ClaimRepository;
import com.allstate.premierclaimsserver.domain.Claim;
import com.allstate.premierclaimsserver.service.ClaimService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class ClaimServiceTest {

    @Autowired
    private ClaimService claimService;
    @Autowired
    private ClaimController claimController;

    @MockBean
    private ClaimRepository claimRepository;

    @Test
    void getAllClaims(){
        List<Claim> claims  = new ArrayList<>();
        claims.add(new Claim(500.00, "John", "Smith", "JSmith@gmail.com", "02871258652", "Open", new Date(System.currentTimeMillis()), "1001","Auto",  ""));
        claims.add(new Claim(300.00, "Sam", "Smith", "SSmith@gmail.com", "02871258652", "Open", new Date(System.currentTimeMillis()), "1002","Auto",  ""));
        claims.add(new Claim(275.00, "Ian", "Smith", "ISmith@gmail.com", "02871258652", "Open", new Date(System.currentTimeMillis()), "1001","Auto",  ""));
        Mockito.when(claimRepository.findAll()).thenReturn(claims);

        List<Claim> returnedClaims = claimService.getAllClaims();
        assertEquals(3, returnedClaims.size());
    }
//    @Test
//    void getByStatus(){
//        List<Claim> claims  = new ArrayList<>();
//        claims.add(new Claim(500.00, "John", "Smith", "JSmith@gmail.com", "02871258652", "Open", new Date(System.currentTimeMillis()), "1001","Auto",  ""));
//        claims.add(new Claim(300.00, "Sam", "Smith", "SSmith@gmail.com", "02871258652", "Open", new Date(System.currentTimeMillis()), "1002","Auto",  ""));
//        claims.add(new Claim(275.00, "Ian", "Smith", "ISmith@gmail.com", "02871258652", "Closed", new Date(System.currentTimeMillis()), "1001","Auto",  ""));
//        Mockito.when(claimRepository.findAllByStatus("Closed")).thenReturn(claims);
//
//        List<Claim> returnedClaims = claimController.getAllClaims("Closed");
//
//        assertEquals(1, returnedClaims.size());
//    }
}
