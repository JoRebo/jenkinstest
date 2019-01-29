package microservices.book.gamification.event;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Event received when a multiplication has been solved in the system.
 * Provides some context information about the multiplication.
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
class MultiplicationSolvedEvent implements Serializable {

	@JsonProperty("multiplicationResultAttemptId")   Long multiplicationResultAttemptId;
	@JsonProperty("userId")  Long userId;
	@JsonProperty("correct")   boolean correct;

}