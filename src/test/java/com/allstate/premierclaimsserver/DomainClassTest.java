package com.allstate.premierclaimsserver;

import com.allstate.premierclaimsserver.domain.Claim;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DomainClassTest {

    @Test
    void test2ClaimsWithSameIdAreEqual(){
        Claim claim1 = new Claim();
        Claim claim2 = new Claim();
        claim1.setId(123);
        claim2.setId(123);
        assertEquals(claim1,claim2);
    }
}
