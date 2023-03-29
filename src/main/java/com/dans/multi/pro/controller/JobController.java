package com.dans.multi.pro.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dans.multi.pro.feign.JobDto;
import com.dans.multi.pro.feign.JobFeign;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobFeign jobFeign;

    @GetMapping
    public List<JobDto> listJob() {
        return jobFeign.getListJob();
    }

    @GetMapping("/{id}")
    public JobDto getJob(@PathVariable("id") UUID id) {
        return jobFeign.getJobById(id);
    }
}
