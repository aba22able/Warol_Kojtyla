package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Library extends PrototypeLibrary<Library> {

    String name;
    Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String s = "Library [" + name + "]";
        for (Book book : books) {
            s = s + "\n" + book.toString();
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books);
    }

    public Library shallowCopy() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException
    {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book book : getBooks()) {
            clonedLibrary.getBooks().add(book);
        }

        return clonedLibrary;
    }
}