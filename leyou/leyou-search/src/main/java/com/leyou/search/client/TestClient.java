package com.leyou.search.client;

import com.leyou.item.api.TestApi;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("item-service")
public interface TestClient {



}