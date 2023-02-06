package com.allstate.premierclaimsserver;
import com.allstate.premierclaimsserver.control.ClaimController;
import com.allstate.premierclaimsserver.data.ClaimRepository;
import com.allstate.premierclaimsserver.domain.Claim;
import com.allstate.premierclaimsserver.exceptions.ClaimNotFoundException;
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
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        claims.add(new Claim(1, 275.00, "Jane", "Smith", "JSmith@gmail.com", "Open","Open", new Date(System.currentTimeMillis()), "John","1003", "" , "" , ""  ,"" , "" , "" , ""));
        claims.add(new Claim(2, 275.00, "Jane", "Smith", "JSmith@gmail.com", "Open","Open", new Date(System.currentTimeMillis()), "John","1003", "" , "" , ""  ,"" , "" , "" , ""));
        claims.add(new Claim(3, 275.00, "Jane", "Smith", "JSmith@gmail.com", "Open","Open", new Date(System.currentTimeMillis()), "John","1003", "" , "" , ""  ,"" , "" , "" , ""));
        Mockito.when(claimRepository.findAll()).thenReturn(claims);

        List<Claim> returnedClaims = claimService.getAllClaims();
        assertEquals(3, returnedClaims.size());
    }
@Test
void getByIdNotFound(){

    Mockito.when(claimRepository.findById(1)).thenReturn(Optional.empty());
        assertThrows(ClaimNotFoundException.class, ()-> {claimService.getById(1);});
}
}
