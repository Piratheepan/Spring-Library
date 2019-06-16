package com.sgic.library.services;



import java.util.List;

import com.sgic.library.entities.MainClassification;
import com.sgic.library.entities.SubClassification;


public interface SubClassificationService {
	void saveSubClassification(SubClassification subClassification);
	List<SubClassification> findAll();
}
