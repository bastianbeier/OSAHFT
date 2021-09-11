package com.osahft.api.controller;

import com.osahft.api.model.SoftwareVersionInformation;
import com.osahft.api.test.service.PublicServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private PublicServiceIF publicService;

    @RequestMapping(value = "/software/version", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public SoftwareVersionInformation retrieveSoftwareVersionInformation() {
        return publicService.retrieveSoftwareVersionInformation();
    }
}
