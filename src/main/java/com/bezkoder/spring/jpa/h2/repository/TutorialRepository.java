package com.bezkoder.spring.jpa.h2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.jpa.h2.model.Tutorial;

/**
 * Repository interface for performing CRUD operations on Tutorial entities.
 * Extends JpaRepository to provide standard database operations.
 */
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

  /**
   * Retrieves a list of tutorials based on their published status.
   *
   * @param published The published status to filter by.
   * @return A list of tutorials with the specified published status.
   */
  List<Tutorial> findByPublished(boolean published);
  /**
   * Retrieves a list of tutorials whose titles contain the specified string,
   * case-insensitively.
   *
   * @param title The string to search within tutorial titles.
   * @return A list of tutorials with titles containing the specified string.
   */
  List<Tutorial> findByTitleContainingIgnoreCase(String title);
}
