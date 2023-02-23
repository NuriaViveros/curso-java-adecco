package exampleinterfaces.books;

/*
* id
* description
* author (clase)
* numPages
* isbn
* language
* available
* editorial (clase)
* price
* type (enum)
* releaseDate
* ratings
*
*

*/

import java.time.LocalDate;

public class Book {
    private Long id;
    private String description;
    private Integer numPages;
    private String isbn;
    private String language;
    private Boolean available;
    private Double price;
    private LocalDate releaseDate;

    public Book() {
    }

    public Book(Long id, String description, Integer numPages, String isbn, String language, Boolean available, Double price, LocalDate releaseDate) {
        this.id = id;
        this.description = description;
        this.numPages = numPages;
        this.isbn = isbn;
        this.language = language;
        this.available = available;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
