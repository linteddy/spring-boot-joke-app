package io.github.linteddy.jokeapp.services;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JokeServiceImplTest {
    private JokeService jokeService = new JokeServiceImpl();
    @Test
    public void getJoke() {
        String joke = jokeService.getJoke();
        assertThat(joke).isNotEmpty();
    }
}