package com.starterkit.springboot.brs.controller.v1.command;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by Kelompok 3 Kelompok 3.
 */
@Data
@Accessors(chain = true)
public class ProfileFormCommand {
    @NotBlank
    @Size(min = 1, max = 40)
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    @Size(min = 5, max = 13)
    private String mobileNumber;
}
