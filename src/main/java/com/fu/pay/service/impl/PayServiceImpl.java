package com.fu.pay.impl;

import com.fu.pay.service.PayService;
import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Slf4j
@Service
public class PayServiceImpl implements PayService {
    @Override
    public PayResponse create(String orderId, BigDecimal amount) {
        WxPayConfig wxPayConfig = new WxPayConfig();
        wxPayConfig.setAppId("wx3e6b9f1c5a7ff034");
        wxPayConfig.setMchId("1614433647");
        wxPayConfig.setMchKey("Aa111111111122222222223333333333");
        wxPayConfig.setNotifyUrl("http://127.0.0.1");

        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayConfig(wxPayConfig);


        PayRequest request = new PayRequest();
        request.setOrderName("最好的支付sdk");
        request.setOrderId(orderId);
        request.setOrderAmount(amount.doubleValue());
        request.setPayTypeEnum(BestPayTypeEnum.WXPAY_NATIVE);


        PayResponse response = bestPayService.pay(request);
        log.info("发起支付 response={}", response);

        return null;
    }
}
