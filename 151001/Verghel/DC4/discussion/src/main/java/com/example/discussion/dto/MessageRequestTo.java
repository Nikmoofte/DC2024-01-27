package com.example.discussion.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

@Data
public class MessageRequestTo {

    int id;
    int issueId;
    @Size(min = 2, max = 2048)
    String content;
    String country;
    String method;
}
