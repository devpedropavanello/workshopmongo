package com.devpavanello.workshopmongo.entity;

import com.devpavanello.workshopmongo.dto.AuthorDTO;
import com.devpavanello.workshopmongo.dto.CommentDTO;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(collection = "post")
public class Post implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO author;

    private List<CommentDTO> comments =  new ArrayList<>();

    public Post(String id, Date date, String title, String body, AuthorDTO author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }
}
