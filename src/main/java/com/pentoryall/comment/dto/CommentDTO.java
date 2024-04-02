package com.pentoryall.comment.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CommentDTO {
    private long code;
    private long userCode;
    private long postCode;
    private long refCommentCode;
    private String content;
    private char isDeleted;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
