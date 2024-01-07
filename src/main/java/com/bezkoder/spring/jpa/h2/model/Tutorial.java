package com.bezkoder.spring.jpa.h2.model;

import jakarta.persistence.*;

/**
 * Represents a tutorial entity in the database.
 */
@Entity
@Table(name = "tutorials")
public class Tutorial {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @Column(name = "published")
  private boolean published;

  /**
   * Default constructor.
   */
  public Tutorial() {
  }

  /**
   * Constructs a new Tutorial with specified title, description, and published status.
   *
   * @param title       the title of the tutorial.
   * @param description the description of the tutorial.
   * @param published   the published status of the tutorial.
   */
  public Tutorial(String title, String description, boolean published) {
    this.title = title;
    this.description = description;
    this.published = published;
  }

  /**
   * Gets the ID of the tutorial.
   *
   * @return the ID of the tutorial.
   */
  public long getId() {
    return id;
  }

  /**
   * Gets the title of the tutorial.
   *
   * @return the title of the tutorial.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the title of the tutorial.
   *
   * @param title the new title of the tutorial.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Gets the description of the tutorial.
   *
   * @return the description of the tutorial.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the description of the tutorial.
   *
   * @param description the new description of the tutorial.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Checks if the tutorial is published.
   *
   * @return true if the tutorial is published, otherwise false.
   */
  public boolean isPublished() {
    return published;
  }

  /**
   * Sets the published status of the tutorial.
   *
   * @param isPublished the new published status of the tutorial.
   */
  public void setPublished(boolean isPublished) {
    this.published = isPublished;
  }

  /**
   * Returns a string representation of the Tutorial object.
   *
   * @return a string representation of the Tutorial object.
   */
  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
  }
}
