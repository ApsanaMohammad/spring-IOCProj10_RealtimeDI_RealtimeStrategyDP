// MainController.java
package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController {
    private CustomerMgmtService service;

    public MainController(CustomerMgmtService service) {
        System.out.println("MainController 1 param constructor");
        this.service = service;
    }

    public String processCustomer(CustomerVO vo) throws Exception {
        CustomerDTO dto = new CustomerDTO();
        dto.setCustName(vo.getCustName());
        dto.setCustAddrs(vo.getCustAddrs());
        dto.setPamt(Float.parseFloat(vo.getPamt()));
        dto.setTime(Float.parseFloat(vo.getTime()));
        dto.setRate(Float.parseFloat(vo.getRate()));
        return service.calculateSimpleInterest(dto);
    }
}
