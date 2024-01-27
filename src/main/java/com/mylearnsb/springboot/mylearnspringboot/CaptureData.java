package com.mylearnsb.springboot.mylearnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CaptureData {
	
	@RequestMapping("/capture")
	public List<CaptureDataSource> retrieveAllData(){
		return Arrays.asList( new CaptureDataSource(1,"Pega Infinity","BPM", "Pega tool helps the smothen the business process with proper defined work flows"),
				new CaptureDataSource(2,"Guidewire Claimcenter", "Workflows", "Claimcenter tool helps to enhance working process for Insurance claim industry"),
				new CaptureDataSource(3,"iLog", "Workflows", "iLog is a workflow building tool")
				);
	}

}