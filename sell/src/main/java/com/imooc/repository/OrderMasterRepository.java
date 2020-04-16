package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: 郭师兄
 * @Date: 2020/2/25 7:44
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

    Page<OrderMaster> findByBuyerOpenid(String openid, Pageable pageable);
}
