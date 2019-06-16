package com.sgic.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.entities.Book;
import com.sgic.library.entities.MainClassification;

import com.sgic.library.repositories.MainClassificationRepository;

@Service
public class MainClassificationImpl implements MainClassificationService{
	@Autowired
	MainClassificationRepository mainClassificationRepository;
	public void saveMainClassification(MainClassification mainClassification) {
		mainClassificationRepository.save(mainClassification);
	}
	@Override
	public List<MainClassification> findAll() {
		List<MainClassification> mainClassificationList =mainClassificationRepository.findAll();
		return mainClassificationList;
	}
//	@Override
//	public MainClassification getMainClassificationById(Long id) {
//		return mainClassificationRepository.findMainClassificationById(id);
//	}
}
