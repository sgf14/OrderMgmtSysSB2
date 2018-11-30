package com.sgfdb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Product {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)	//see below
	//@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;
	
	private String name;	
	private String description;	
	private String sku;

	//using lombok annotations above to generate getters/setters
	
	/*Generated value.  can actually use .IDENTITY or AUTO.  both work ok to establish a db sequencer function
	 * was playing around with what i thought was failure to commit issue
	 * but it was rally the application.properties ddl.auto= create issue.  had to comment out
	 * or it kept overwriting the table/wiping out all the data.
	 * in MySQl was finding .IDENTITY setting worked better
	 * 
	 * AUTO INCREMENT.  note in postgres you would use serialBigInt- see online search results
	 * instead of the auto increment property that mySql uses.  so its slightly different approach
	 */
}
