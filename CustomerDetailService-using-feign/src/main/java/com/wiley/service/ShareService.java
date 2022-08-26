package com.wiley.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wiley.bean.Share;

@FeignClient("share-service")
public interface ShareService {

	@GetMapping(path = "/shares/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Share getShareById(@PathVariable("id") String ShareId);
}
