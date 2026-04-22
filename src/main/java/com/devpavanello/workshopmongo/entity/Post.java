package com.devpavanello.workshopmongo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Document(collection = "post")
@NoArgsConstructor
@AllArgsConstructor
public class Post implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private User author;
}
