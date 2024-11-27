package it.uniroma3.idd.search_engine.dto;

import lombok.*;
import org.apache.lucene.document.Document;

import java.util.Collection;
import java.util.Map;

@Data @NoArgsConstructor @AllArgsConstructor
public class GetTableResponse {

    private String id;
    private String caption;
    private String body;
    private String footnotes;
    private String references;


    public GetTableResponse tableToGetTableResponse(Document document) {

        return new GetTableResponse(
                document.get("id"),
                document.get("caption"),
                document.get("body"),
                document.get("footnotes"),
                document.get("references")
        );

    }


}