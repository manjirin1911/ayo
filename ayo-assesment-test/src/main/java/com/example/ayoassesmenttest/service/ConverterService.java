package com.example.ayoassesmenttest.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class ConverterService {
	//This method is used for convert kilometer to Mile and vice versa
		public HashMap<String, Double> convertKilometerToMiles(Double param) throws Exception{
			try {
			HashMap<String, Double> result = new HashMap<>();
			Double kiloToMiles = param * 0.62;
			result.put("Kilometers to Miles", kiloToMiles);
			Double milesToKilo = param *1.61;
			result.put("Miles to Kilometers", milesToKilo);
			return result;
			}catch (Exception e) {
				throw new Exception("Something went wrong !!");
			}
			
		}
		
		//This method is used for convert feet to meters and vice versa
		public HashMap<String, Double> convertMetersToFeet(Double param) throws Exception{
			try {
			HashMap<String, Double> result = new HashMap<>();
			Double metersToFeet = param * 3.28;
			result.put("Meters to Feet", metersToFeet);
			Double feetToMeters = param * 0.30;
			result.put("Feet to Meters", feetToMeters);
			return result;
			}catch (Exception e) {
				throw new Exception("Something went wrong !!");
			}
		}
		
		//This method is used for convert centimeters to inches and vice versa
		public HashMap<String, Double> convertCentimetersToInches(Double param) throws Exception{
			try {
			HashMap<String, Double> result = new HashMap<>();
			Double centimetersToInches = param * 0.39;
			result.put("Centimeters to Inches", centimetersToInches);
			Double inchesToCentimeters = param * 2.54;
			result.put("Inches to Centimeters", inchesToCentimeters);
			return result;
			}catch (Exception e) {
				throw new Exception("Something went wrong !!");
			}
		}
		
		//This method is used for convert liters to gallons and vice versa
		public HashMap<String, Double> convertLitersToGallons(Double param) throws Exception{
			try {
			HashMap<String, Double> result = new HashMap<>();
			Double litersToGallons = param * 0.264;
			result.put("LitersToGallons", litersToGallons);
			Double gallonsToLiters = param * 3.785;
			result.put("GallonsToLiters", gallonsToLiters);
			return result;
			}catch (Exception e) {
				throw new Exception("Something went wrong !!");
			}
		}
		
		//This method is used for convert celsis to fahrenheit and vice versa
		public HashMap<String, Double> convertCelsiusToFahrenheit(Double param) throws Exception{
			try {
			HashMap<String, Double> result = new HashMap<>();
			Double celsiusToFahrenheit = (param * 1.8000) + 32;
			result.put("Celsius To Fahrenheit", celsiusToFahrenheit);
			Double fahrenheitToCelsius = (param - 32) / 1.8000;
			result.put("Fahrenheit To Celsius", fahrenheitToCelsius);
			return result;
			}catch (Exception e) {
				throw new Exception("Something went wrong !!");
			}
		}

	}