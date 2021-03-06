package io.freezing.ai.io.input;

import io.freezing.ai.domain.PokerState;
import io.freezing.ai.exception.input.PokerInputException;

import java.util.Optional;

public interface PokerInput extends AutoCloseable {
    /** Returns PokerState if it exists or empty if the game is over or not running */
    Optional<PokerState> getState() throws PokerInputException;
}
