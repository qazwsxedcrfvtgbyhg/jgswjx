package cn.kgc.mapper;

import cn.kgc.bean.Bill;

import java.util.List;

public interface BillMapper {


    //根据商品名称模糊查询
    List<Bill> getproductName(String productName);

    //根据供应商id查询
    List<Bill> getproviderId(Integer providerId);


    //根据商品名称和是否支付查询
    List<Bill> getproviderName(Bill bill);


}
