package com.platzi.javatests.movies.data;

import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class MovieRepositoryIntegrationTest {
    private MovieRepositoryJdbc movieRepositoryJdbc;
    private DataSource dataSource;
    @Before
    public void setUp() throws Exception {
        // Utilizamos una utilidad de SpringJdbc para conectarnos a una base de datos creada en memoria
        // utilizando el framework h2database
        dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL","sa","sa");
        // se ejecuta un script para crear una tabla de peliculas
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql.scripts/test-data.sql"));
        // creamos un template con la base de datos que necesita nuestro clase MovieRepositoryJdbc
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        movieRepositoryJdbc = new MovieRepositoryJdbc(jdbcTemplate);
    }

    @Test
    public void loadAllMovies() throws SQLException {
        // probamos su funcionamiento
        Collection<Movie> movies = movieRepositoryJdbc.findAll();
        assertThat(movies, CoreMatchers.is(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION)
        )));
    }

    @Test
    public void loadMovieById() {
        Movie movie = movieRepositoryJdbc.findById(2);
        assertThat(movie, CoreMatchers.is(new Movie(2, "Memento", 113, Genre.THRILLER)));
    }

    @Test
    public void insertAMovie() {
        Movie movie = new Movie("Super 8", 112, Genre.THRILLER);
        movieRepositoryJdbc.saveOrUpdate(movie);
        Movie movieFromDb = movieRepositoryJdbc.findById(4);
        assertThat(movieFromDb, CoreMatchers.is(new Movie(4, "Super 8", 112, Genre.THRILLER)));
    }

    @After
    public void tearDown() throws Exception {
        final Statement s = dataSource.getConnection().createStatement();
        s.execute("drop all objects delete files");
    }
}