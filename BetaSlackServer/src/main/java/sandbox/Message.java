package sandbox;








import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Message {

    private String content;

    private LocalDateTime timestamp;

    private Message (){

    }


    public Message(String content) {
        this.content = content;
        timestamp = LocalDateTime.now();
    }

    public Message(LocalDateTime timestamp,String content){
        this.timestamp = timestamp;
        this.content = content;

    }



}
