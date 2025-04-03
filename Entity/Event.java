package edu.tejas.eventManagement.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Component
@Entity
public class Event {

	@Id
	private int id;
	private String name;
	private String discription;
	private String location;
	private String date;
	private long contactDetails;
}
