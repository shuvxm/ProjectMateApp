package com.shuvxm.PMA.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Issue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	private User assignee;

}
