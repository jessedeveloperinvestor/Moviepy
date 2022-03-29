package softwares.jessleite.moviepy.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Moviepy implements Serializable {
	@Id
	@GneratedValue
	private Long id;
	private String movie;
	private String photourl;
	private String movieurl;
	private String type;
	private String year;
	private String description;
}