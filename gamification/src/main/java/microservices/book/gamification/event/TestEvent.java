package microservices.book.gamification.event;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
class TestEvent implements Serializable{
	
	@JsonProperty("status") boolean status;    
	
}
