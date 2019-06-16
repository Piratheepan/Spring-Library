package com.sgic.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.entities.MainClassification;
import com.sgic.library.entities.SubClassification;

import com.sgic.library.repositories.SubClassificationRepository;

@Service
public class SubClassificationImpl implements SubClassificationService{
	@Autowired
	SubClassificationRepository subClassificationRepository;
	public void saveSubClassification(SubClassification subClassification) {
		subClassificationRepository.save(subClassification);
	}
	@Override
	public List<SubClassification> findAll() {
		List<SubClassification> subClassificationList =subClassificationRepository.findAll();
		return subClassificationList;
	}
}
