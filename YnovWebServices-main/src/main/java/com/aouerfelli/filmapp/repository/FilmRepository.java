package com.aouerfelli.filmapp.repository;

import com.aouerfelli.filmapp.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, String> {
}
