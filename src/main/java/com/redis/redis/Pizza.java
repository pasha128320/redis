package com.redis.redis;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.List;
import java.util.Set;

@RedisHash("pizza")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Pizza {

    @Id
    private String user;

    private Set<PurchaseList> purchaseList;

    @Setter
    @Getter
    @RequiredArgsConstructor
    public class PurchaseList{
        private String name;
        private int price;
        private int amount;
        private int summary = amount * price;



    }


}
