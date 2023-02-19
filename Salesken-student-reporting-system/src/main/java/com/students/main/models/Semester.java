package com.students.main.models;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Semester {

	    private int semId;
	    private int English;
	    private int Maths;
	    private int Science;
	    
	    
	    
	    public Semester(int semId)
	    {
	        this.semId = semId;
	    }
	
	    
}
