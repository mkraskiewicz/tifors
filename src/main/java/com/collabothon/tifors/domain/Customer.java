package com.collabothon.tifors.domain;

        import lombok.Data;

/**
 * Created by Maciej on 23/08/2018
 */
@Data

public class Customer {

    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private Integer interestedIn;

}
