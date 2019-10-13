package com.sb.andemen.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PackageName: com.sb.andemen
 * @ClassName: Article
 * @Description:
 * @author: xjj
 * @date: 2019/10/13 10:16
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Article {
    private Long id;
    private String anthor;
}
