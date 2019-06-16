package com.sgic.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sgic.library.entities.MainClassification;


public interface MainClassificationRepository extends JpaRepository<MainClassification,Long>{
	//MainClassification findMainClassificationById(Long id);
	
}
