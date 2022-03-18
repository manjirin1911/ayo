package com.example.ayoassesmenttest.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ayoassesmenttest.service.ConverterService;

@RestController
@RequestMapping("/converter")
public class ConverterController {
	
	@Autowired
	private ConverterService converterService;
	
	@GetMapping("/kilo-to-miles/{param}")
	ResponseEntity<Object> kilometersToMiles(@PathVariable Double param) throws Exception{
		HashMap<String, Double> result = converterService.convertKilometerToMiles(param);
		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}
	
	@GetMapping("/meters-to-feet/{param}")
	ResponseEntity<Object> metersToFeet(@PathVariable Double param) throws Exception{
		HashMap<String, Double> result = converterService.convertMetersToFeet(param);
		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}
	
	@GetMapping("/centimeters-to-inches/{param}")
	ResponseEntity<Object> centimetersToInches(@PathVariable Double param) throws Exception{
		HashMap<String, Double> result = converterService.convertCentimetersToInches(param);
		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}
	
	@GetMapping("/liters-to-gallons/{param}")
	ResponseEntity<Object> litersToGallons(@PathVariable Double param) throws Exception{
		HashMap<String, Double> result = converterService.convertLitersToGallons(param);
		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}
	
	@GetMapping("/celsius-to-fahrenheit/{param}")
	ResponseEntity<Object> celsiusToFahrenheit(@PathVariable Double param) throws Exception{
		HashMap<String, Double> result = converterService.convertCelsiusToFahrenheit(param);
		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}

}