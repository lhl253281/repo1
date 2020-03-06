package com.leyou.item.service;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.Spu;
import com.leyou.item.pojo.SpuBo;
import com.leyou.item.pojo.SpuDetail;

import java.util.List;

public interface GoodsService {


    PageResult<SpuBo> querySpuBoByPage(String key, Boolean saleable, Integer page, Integer rows);

    void saveGoods(SpuBo spuBo);


    /**
     * 根据spuId查询sku的集合
     * @param spuId
     * @return
     */
    List<Sku> querySkusBySpuId(Long spuId);

    /**
     * 根据spuId查询spuDetail
     * @param spuId
     * @return
     */
   SpuDetail querySpuDetailBySpuId(Long spuId);

    /**
     * 商品更新
     * @param spu
     */
    void updateGoods(SpuBo spu);


    Spu querySpuById(Long id);

    public Sku querySkuById(Long id);
}