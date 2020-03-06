package com.leyou.goods.client;

import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("item-service")
public interface TestClient {



}
